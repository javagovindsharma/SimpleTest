package codingchallenge.ipodInventoryProblem.store;

import codingchallenge.ipodInventoryProblem.constants.StoreConstants;

/**
 * Created by Govind on 29/06/2018
 */
public class Inventory {
    private StoreConstants.Item itemType;
    private int itemCount;
    private int itemPrice;

    public Inventory(StoreConstants.Item itemType, int itemCount) {
        this.itemType = itemType;
        this.itemCount = itemCount;
    }

    public Inventory(StoreConstants.Item itemType, int itemCount, int itemPrice) {
        super();
        this.itemType = itemType;
        this.itemCount = itemCount;
        this.itemPrice = itemPrice;
    }

    public StoreConstants.Item getItemType() {
        return itemType;
    }

    public void setItemType(StoreConstants.Item itemType) {
        this.itemType = itemType;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
}
