package codingchallenge.ipodInventoryProblem.store;

import codingchallenge.ipodInventoryProblem.constants.StoreConstants;
import codingchallenge.ipodInventoryProblem.constants.StoreConstants.*;
import codingchallenge.ipodInventoryProblem.service.OrderService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Govind on 29/06/2018
 */
public class Store {

    public static Store createArgentinaStore(){
        return new Store(StoreConstants.ARGENTINA,
                new Inventory(Item.IPOD,StoreConstants.ARGENTINA_IPOD, StoreConstants.ARGENTINA_IPOD_COST),
                new Inventory(Item.IPHONE,StoreConstants.ARGENTINA_IPHONE, StoreConstants.ARGENTINA_IPHONE_COST));

    }
    public static Store createBrazilStore(){
        return new Store(StoreConstants.BRAZIL,
                new Inventory(Item.IPOD,StoreConstants.BRAZIL_IPOD, StoreConstants.BRAZIL_IPOD_COST),
                new Inventory(Item.IPHONE,StoreConstants.BRAZIL_IPHONE, StoreConstants.BRAZIL_IPHONE_COST));
    }

    private String storeLocation;
    private Map<StoreConstants.Item,Inventory> inventory = new HashMap<>();

    public Store(String storeLocation, Inventory... inventory) {
        super();
        this.storeLocation = storeLocation;
        for (Inventory inventoryOrdered : inventory){
            this.inventory.put(inventoryOrdered.getItemType(),inventoryOrdered);
        }
    }

    public int getItemCount(StoreConstants.Item item) {
        return inventory.get(item).getItemCount();
    }

    public int getItemPrice(StoreConstants.Item itemType) {
        return inventory.get(itemType).getItemPrice();
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setItemCount(StoreConstants.Item itemType, int itemCount) {
        this.inventory.get(itemType).setItemCount(itemCount);

    }

    public String processOrder(String inputString) {
        return OrderService.fulfill(inputString);
    }
}
