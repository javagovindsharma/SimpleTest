package codingchallenge.salestaxproblem.cart;

import codingchallenge.salestaxproblem.item.ItemInterface;

/**
 * Created by Govind on 29/05/2018
 */
public interface CartInterface {
    void addItemToCart(ItemInterface item);
    void calculateAndPrintReceiptWithTax();
    float getTotalCost();
    float getSalesTax();
}
