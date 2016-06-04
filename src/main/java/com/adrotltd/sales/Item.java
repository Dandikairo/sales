
package com.adrotltd.sales;

/**
 *
 * @author Okello
 */
public class Item {
   private String itemNo;
   private String description;
   private double unitPrice;

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getItemNo() {
        return itemNo;
    }

    public String getDescription() {
        return description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

}
