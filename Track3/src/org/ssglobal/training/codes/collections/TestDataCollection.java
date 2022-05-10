package org.ssglobal.training.codes.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestDataCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//----------------------------------------
		//				Invoice
		//----------------------------------------
		// ID | Vendor Name | Date Invoiced | Total
		// 101| McDonalds	| April 10, 2021| 80900.00
		// 102| Jollibee	| April 11, 2022| 100900.00
		
		List<Invoice> records = new ArrayList<>();
		
		Invoice rec1 = new Invoice();
		rec1.setId(101);
		rec1.setVendorName("McDonald's");
		rec1.setDateInvoiced(LocalDate.of(2021, 04, 10));
		rec1.setTotal(80900.00);
		records.add(rec1);
		
		Invoice rec2 = new Invoice();
		rec2.setId(102);
		rec2.setVendorName("Jollibee");
		rec2.setDateInvoiced(LocalDate.of(2022, 04, 11));
		rec2.setTotal(100900.00);
		records.add(rec2);
		
		Invoice rec3 = new Invoice();
		rec3.setId(103);
		rec3.setVendorName("KFC");
		rec3.setDateInvoiced(LocalDate.of(2022, 03, 21));
		rec3.setTotal(20000.00);
		records.add(rec3);
		
		// Two problems
		
		Collections.sort(records, new IdComparator());
		
		for(Invoice inv : records) {
			System.out.format("%d %s %s %.3f \n", inv.getId(), inv.getVendorName(),
					inv.getDateInvoiced(), inv.getTotal());
		}
		
		Collections.sort(records, new VendorNameComparator());
		
		for(Invoice inv : records) {
			System.out.format("%d %s %s %.3f \n", inv.getId(), inv.getVendorName(),
					inv.getDateInvoiced(), inv.getTotal());
		}
		
		records.sort(new IdComparator());
		for(Invoice inv : records) {
			System.out.format("%d %s %s %.3f \n", inv.getId(), inv.getVendorName(),
					inv.getDateInvoiced(), inv.getTotal());
		}
		
		
		System.out.println(records);
		
	}

}

// Comparator requirements:
// 1. Avoid using Comparator with Comparable
// 2. Create a utility class for Comparator
// 3. Choose attribute(s) to apply Comparator with.

//class Invoice implements Comparable<Invoice>{

class Invoice{
	
	// avoid primitive type
	private Integer id;
	private String vendorName;
	private LocalDate dateInvoiced;
	private Double total;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public LocalDate getDateInvoiced() {
		return dateInvoiced;
	}
	public void setDateInvoiced(LocalDate dateInvoiced) {
		this.dateInvoiced = dateInvoiced;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}

	
/*	
	// comparing ids
	@Override
	public int compareTo(Invoice o) {
		
		if(id.compareTo(o.getId()) == 0) {
			return 0;
		} else if(id.compareTo(o.getId()) > 0){
			return 2;
		} else {
			return -2;
		}
	}
*/	
	@Override
	public String toString() { // Object to a Str description
		return String.join(" ", String.valueOf(id), vendorName,
				dateInvoiced.toString(), String.valueOf(total)); //bawal concat
	}
}	
class IdComparator implements Comparator<Invoice>{

	@Override
	public int compare(Invoice o1, Invoice o2) {

		if(o1.getId().compareTo(o2.getId()) == 0) {
			return 0;
		}else if (o1.getId().compareTo(o2.getId()) > 0) {
			return 2;
		}else {
			return -2;
		}
	}
		
}

class VendorNameComparator implements Comparator<Invoice>{

	@Override
	public int compare(Invoice o1, Invoice o2) {

		if(o1.getVendorName().compareTo(o2.getVendorName()) == 0) {
			return 0;
		}else if (o1.getVendorName().compareTo(o2.getVendorName()) > 0) {
			return 2;
		}else {
			return -2;
		}
	}	
}
	

