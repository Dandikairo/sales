
package com.adrotltd.sales;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Okello
 */
public class Invoice {
private String number;
private String customerNo;
private LocalDate date;
private List<InvoiceLine> lines;
private Double totalAmount;
        
}
