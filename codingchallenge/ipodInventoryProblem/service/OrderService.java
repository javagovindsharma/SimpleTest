package codingchallenge.ipodInventoryProblem.service;

import codingchallenge.ipodInventoryProblem.constants.StoreConstants;
import codingchallenge.ipodInventoryProblem.store.Inventory;
import codingchallenge.ipodInventoryProblem.store.Order;
import codingchallenge.ipodInventoryProblem.store.Store;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Govind on 29/06/2018
 */
public class OrderService {

    private static Map<String, Store> allStores = new LinkedHashMap<>();

    private static final int DISCOUNT_PERCENTAGE = 20;
    private static final int TRANSPORT_COST_PER_LOT = 400;
    private static final int DISCOUNTED_COST_PER_LOT = TRANSPORT_COST_PER_LOT
            - (DISCOUNT_PERCENTAGE * TRANSPORT_COST_PER_LOT) / 100;
    private static final int QUANTA = 10;

    static {
        initializeStores();
    }

    private static int calcPurchaseCosts(Order order, Store purchaseStore, StoreConstants.Item itemType) {
        Store foriegnStore = OrderService.getForeignStore(purchaseStore);
        int itemReq = order.getItemCount(itemType);
        int cost = 0;
        int maxItemForImport = itemReq;
        int tempCost = 0;
        int tempHome = purchaseStore.getItemCount(itemType);
        int tempFor = foriegnStore.getItemCount(itemType);

        boolean isDiscountApplicable = foriegnStore.getStoreLocation().equals(order.getNationality());

        int transportCost = 0;

        for (int itemForImport = 0; itemForImport <= maxItemForImport; itemForImport++) {
            int itemFromHomeLocation = itemReq - itemForImport;
            if (purchaseStore.getItemCount(itemType) < itemFromHomeLocation) {
                continue;
            }
            transportCost = calculateTransportCost(isDiscountApplicable, itemForImport);
            tempCost = itemFromHomeLocation * purchaseStore.getItemPrice(itemType) + itemForImport
                    * foriegnStore.getItemPrice(itemType) + transportCost;
            if (cost == 0) {
                cost = tempCost;
                tempHome = purchaseStore.getItemCount(itemType) - itemFromHomeLocation;
                tempFor = foriegnStore.getItemCount(itemType) - itemForImport;
            } else {
                if (tempCost < cost) {
                    cost = tempCost;
                    tempHome = purchaseStore.getItemCount(itemType) - itemFromHomeLocation;
                    tempFor = foriegnStore.getItemCount(itemType) - itemForImport;
                }
            }
        }
        purchaseStore.setItemCount(itemType, tempHome);
        foriegnStore.setItemCount(itemType, tempFor);
        return cost;

    }

    private static int calculateTransportCost(boolean isDiscountApplicable, int importItemCount) {
        int transportCost;
        if (importItemCount == 0) {
            transportCost = 0;
        } else {
            transportCost = isDiscountApplicable ? ((importItemCount - 1) / QUANTA + 1)
                    * DISCOUNTED_COST_PER_LOT : ((importItemCount - 1) / QUANTA + 1)
                    * TRANSPORT_COST_PER_LOT;
        }
        return transportCost;
    }

    public static String convertToOutputFormat(String cost, Store purchaseStore) {
        String output = cost;
        for (StoreConstants.Item item : StoreConstants.Item.values()) {
            for (Map.Entry<String, Store> entry : allStores.entrySet()) {
                output += ":" + allStores.get(entry.getKey()).getItemCount(item);
            }
        }
        return output;
    }

    public static String fulfill(String inputString) {
        initializeStores();
        String output = "";
        Store purchaseStore = allStores.get(inputString.split(":")[0]);
        Order order = parseInput(inputString);

        int cost = 0;
        try {
            validateStock(order, purchaseStore);
            for (StoreConstants.Item itemType : order.getItems()) {
                cost += calcPurchaseCosts(order, purchaseStore, itemType);
            }
            output = OrderService.convertToOutputFormat(String.valueOf(cost), purchaseStore);
        } catch (OutOfStockException e) {
            output = OrderService.convertToOutputFormat(StoreConstants.OUT_OF_STOCK, purchaseStore);
        }

        return output;
    }

    private static Store getForeignStore(Store homeStore) {
        for (Map.Entry<String, Store> entry : OrderService.allStores.entrySet()) {
            if (homeStore != entry.getValue()) {
                return entry.getValue();
            }
        }
        return null;
    }

    private static void initializeStores() {
        Store brazilStore = Store.createBrazilStore();
        Store argentianStore = Store.createArgentinaStore();

        allStores.put(StoreConstants.BRAZIL, brazilStore);
        allStores.put(StoreConstants.ARGENTINA, argentianStore);
    }
    private static Order parseInput(String inputStr) {
        String[] params = inputStr.split(":");
        if (params.length == 6) {
            return new Order(allStores.get(params[0]), params[1],
                    new Inventory(StoreConstants.Item.getItemType(params[2]), new Integer(params[3])),
                    new Inventory(StoreConstants.Item.getItemType(params[4]), new Integer(params[5])));

        }else if (params.length == 5) {
            return new Order(allStores.get(params[0]), null,
                    new Inventory(StoreConstants.Item.getItemType(params[1]), new Integer(params[2])),
                    new Inventory(StoreConstants.Item.getItemType(params[3]), new Integer(params[4])));

        } else {
            throw new InputMismatchException();
        }

    }

    private static void validateStock(Order order, Store homeStore) throws OutOfStockException {
        Store foriegnStore = OrderService.getForeignStore(homeStore);
        if (order.getItemCount(StoreConstants.Item.IPHONE) > (homeStore.getItemCount(StoreConstants.Item.IPHONE)
                + foriegnStore.getItemCount(StoreConstants.Item.IPHONE))
                || order.getItemCount(StoreConstants.Item.IPOD) > (homeStore.getItemCount(StoreConstants.Item.IPOD)
                + foriegnStore.getItemCount(StoreConstants.Item.IPOD))) {
            throw new OutOfStockException();
        }

    }
}
