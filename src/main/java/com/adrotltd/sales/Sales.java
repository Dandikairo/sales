
package com.adrotltd.sales;

import com.adroitltd.metadata.MenuGroup;
import com.adroitltd.metadata.MenuItem;
import com.adroitltd.metadata.TableViewMetaData;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Okello
 */
public class Sales {
    public static final int ITEMS = 1;
    public static final int CUSTOMERS = 2;
    
    public static MenuGroup getNavigationMenu(){
        MenuGroup sales = new MenuGroup("Sales");
        MenuItem item = new MenuItem(ITEMS, "Items");
        sales.addMenuItem(item);
        
        MenuItem Customers = new MenuItem(CUSTOMERS, "Customers");
        sales.addMenuItem(Customers);
        return sales;
        
        
    }
    
    public static TableViewMetaData getTarget(int targetId){
        TableViewMetaData targetViewMetaData = null;
        //List<?> dataList =null;
        switch(targetId){
            case ITEMS:
                targetViewMetaData = new TableViewMetaData();
                targetViewMetaData.setTitle("Item List");
                targetViewMetaData.addColumn("No.", 100, "itemNo");
                targetViewMetaData.addColumn("Description", 200, "description");
                targetViewMetaData.addColumn("Unit Price", 200, "unitPrice");
                //dataList = Sales.getItems();
                break;
            case CUSTOMERS:
                targetViewMetaData = new TableViewMetaData();
                targetViewMetaData.setTitle("Customer List");
                targetViewMetaData.addColumn("No.", 100, "number");
                targetViewMetaData.addColumn("Name", 200, "name");
                targetViewMetaData.addColumn("Address", 200, "address");
                targetViewMetaData.addColumn("Currency", 200, "currency");
                targetViewMetaData.addColumn("Balance", 200, "balance");
                //dataList = Sales.getCustomer();
                break;
        }
        return targetViewMetaData;
    }
    public static List<?> getTargetData(int targetId){
     switch(targetId){
         case ITEMS:
             return Sales.getItems();
         case CUSTOMERS:
             return Sales.getCustomer();
     }
     return null;
    }
    public static List<Customer> getCustomer(){
        List<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer();
        customer1.setNumber("0001");
        customer1.setName("Okello Dan");
        customer1.setAddress("Makerere University");
        customer1.setCurrency("USD");
        customerList.add(customer1);
        
        Customer customer2 = new Customer();
        customer2.setNumber("0002");
        customer2.setName("Kisekka James");
        customer2.setAddress("kisubi");
        customer2.setCurrency("GBP");
        customerList.add(customer2);
        
        Customer customer3 = new Customer();
        customer3.setNumber("0003");
        customer3.setName("Ouma Collines");
        customer3.setAddress("No Where");
        customer3.setCurrency("POUNDS");
        customerList.add(customer3);
        
        Customer customer4 = new Customer();
        customer4.setNumber("0004");
        customer4.setName("Mujuni John");
        customer4.setAddress("Nsbya");
        customer4.setCurrency("UGX");
        customerList.add(customer4);
        
        return customerList;
    }
        public static List<Item> getItems(){
        List<Item> ItemList = new ArrayList<>(); 
        
        Item item1 = new Item();
        item1.setItemNo("001");
        item1.setDescription("XBOX360");
        item1.setUnitPrice(200);
        ItemList.add(item1);
        
        Item item2 = new Item();
        item2.setItemNo("002");
        item2.setDescription("Play Station 4");
        item2.setUnitPrice(300);
        ItemList.add(item2);
        
        Item item3 = new Item();
        item3.setItemNo("003");
        item3.setDescription("PS Vita");
        item3.setUnitPrice(100);
        ItemList.add(item3);
        
        Item item4 = new Item();
        item4.setItemNo("004");
        item4.setDescription("Play Station 2");
        item4.setUnitPrice(75);
        ItemList.add(item4);
        
        return ItemList;
       
    }
}
