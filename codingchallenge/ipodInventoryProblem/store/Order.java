package codingchallenge.ipodInventoryProblem.store;

import codingchallenge.ipodInventoryProblem.constants.StoreConstants;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Govind on 29/06/2018
 */
public class Order {
    private Store store;
    private String passport;
    private String nationality;
    private Map<StoreConstants.Item,Inventory> items = new HashMap<>();

    public Order(Store store, String passport, Inventory... inventory) {
        this.store = store;
        this.passport = passport;
        setNationality();
        setItems(inventory);
    }
    public int getItemCount(StoreConstants.Item itemType) {
        return this.items.get(itemType).getItemCount();
    }


    public int getItemPrice(StoreConstants.Item itemType) {
        return this.items.get(itemType).getItemPrice();
    }

    public Set<StoreConstants.Item> getItems() {
        return this.items.keySet();
    }

    public String getNationality() {
        return nationality;
    }

    public String getPassport() {
        return passport;
    }

    public Store getStore() {
        return store;
    }

    private void setItems(Inventory... i) {
        for (Inventory inventoryOrdered : i) {
            items.put(inventoryOrdered.getItemType(), inventoryOrdered);
        }
    }

    private void setNationality() {
        if (passport != null && passport.length() > 0) {
            if (StoreConstants.BRAZIL_REGEX.matcher(passport).find(0)) {
                this.nationality = StoreConstants.BRAZIL;
            } else if (StoreConstants.ARGENTINA_REGEX.matcher(passport).find(0)) {
                this.nationality = StoreConstants.ARGENTINA;
            }
        }
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public void setStore(Store store) {
        this.store = store;
    }


}
