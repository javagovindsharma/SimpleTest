package codingchallenge.salestaxproblem.cart;

import codingchallenge.salestaxproblem.item.ItemInterface;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Govind on 29/06/2018
 */
public class Cart implements CartInterface{
    private List<ItemInterface> itemList;
    private float totalCost;
    private float salesTax;
    private static final Format FORMATTER = new DecimalFormat("0.00");

    public Cart() {
        this.itemList = new ArrayList<>();
    }

    @Override
    public void addItemToCart(ItemInterface item) {
        this.itemList.add(item);
    }

    @Override
    public void calculateAndPrintReceiptWithTax() {
        resetCart();
        StringBuilder buffer = new StringBuilder();
        for(ItemInterface item : itemList){
            buffer.append("\n").append(item.toString());
            totalCost += item.getItemPriceWithTax();
            salesTax += item.getItemSalesTax();
        }
        buffer.append("\nSales Tax:" + FORMATTER.format(salesTax));
        buffer.append("\nTotal :" + totalCost);
        System.out.println(buffer.toString());

    }

    private void resetCart() {
        this.totalCost = 0.0f;
        this.salesTax = 0.0f;
    }

    @Override
    public float getTotalCost() {
        return this.totalCost;
    }

    @Override
    public float getSalesTax() {
        return Float.valueOf(FORMATTER.format(salesTax));
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for (ItemInterface item : itemList) {
            buffer.append("\n").append(item.toString());
        }
        return buffer.toString();
    }
}
