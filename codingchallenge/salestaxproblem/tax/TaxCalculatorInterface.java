package codingchallenge.salestaxproblem.tax;

import codingchallenge.salestaxproblem.item.Item;
import codingchallenge.salestaxproblem.item.ItemDefine;
import codingchallenge.salestaxproblem.item.ItemInterface;

/**
 * Created by Govind on 29/05/2018
 */
public interface TaxCalculatorInterface {
    float calculateTax(ItemInterface itemType);
}
