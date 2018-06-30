package codingchallenge.salestaxproblem.tax;

import codingchallenge.salestaxproblem.item.ItemInterface;

/**
 * Created by Govind on 29/05/2018
 */
public class ServiceTaxCalculator implements TaxCalculatorInterface {
    private static final float ROUNDOFF=0.05f;

    @Override
    public float calculateTax(ItemInterface item) {
        return getItemTaxType(item).getApplicableTax() * item.getItemPrice();
    }

    private TaxDefine.TaxType getItemTaxType(ItemInterface item)
    {
        if(item.isItemImported() && !item.isItemExempted())
            return TaxDefine.TaxType.BOTH;
        else if(item.isItemExempted() && item.isItemImported())
            return TaxDefine.TaxType.IMPORTED;
        else if(!item.isItemImported() && !item.isItemExempted())
            return TaxDefine.TaxType.BASIC;
        return TaxDefine.TaxType.NA;
    }
    public float roundOffTax(float tax){
        return (float) Math.ceil(tax/ROUNDOFF)*ROUNDOFF;
    }

}
