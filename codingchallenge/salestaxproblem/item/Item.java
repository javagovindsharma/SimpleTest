package codingchallenge.salestaxproblem.item;

import codingchallenge.salestaxproblem.tax.TaxCalculatorInterface;

/**
 * Created by Govind on 29/05/2018
 */
public class Item implements ItemInterface {
    private float itemPrice;
    private String itemName;
    private ItemDefine.ItemType itemType;

    private TaxCalculatorInterface CALCULATOR;

    @Override
    public void setItemDescription(String description) {
        this.itemName = description;
    }

    @Override
    public String getItemDescription() {
        return itemName;
    }

    @Override
    public void setItemType(ItemDefine.ItemType itemType) {
        this.itemType = itemType;
    }

    @Override
    public void setItemPrice(float price) {
        this.itemPrice = price;
    }

    @Override
    public float getItemPrice() {
        return this.itemPrice;
    }

    @Override
    public Boolean isItemImported() {
        return itemType.isImported();
    }

    @Override
    public Boolean isItemExempted() {
        return itemType.isExempted();
    }

    @Override
    public float getItemPriceWithTax() {
        return getItemSalesTax() + getItemPrice();
    }

    @Override
    public float getItemSalesTax() {
        return (CALCULATOR.calculateTax(this));
    }

    @Override
    public String toString(){
        return 1+ " "+itemName+" :" +getItemPriceWithTax();
    }


}
