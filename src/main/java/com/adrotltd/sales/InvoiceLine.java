
package com.adrotltd.sales;

/**
 *
 * @author Okello
 */
public class InvoiceLine {
   
   private String itemNo;
   private String description;
   private double quantity;
   private double unitPrice;

    public String getDescription() {
        return description;
    }

    public String getItemNo() {
        return itemNo;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    
}
