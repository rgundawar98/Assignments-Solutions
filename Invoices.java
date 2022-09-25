package MavenProject.MavenProjectTest;

import java.util.Date;

public class Invoices 
{ 
	Integer item;
	String itemName;
	Integer itemQty;
	Double totalprice;
	Date itemSoldDate;


	public Invoices(Integer item, String itemName, Integer itemQty, Double totalprice, Date itemSoldDate) {
		super();
		this.item = item;
		this.itemName = itemName;
		this.itemQty = itemQty;
		this.totalprice = totalprice;
		this.itemSoldDate = itemSoldDate;
		
	}


	public Integer getItemId() {
		return item;
	}


	public void setItem(Integer item) {
		this.item = item;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public Integer getItemQty() {
		return itemQty;
	}


	public void setItemQty(Integer itemQty) {
		this.itemQty = itemQty;
	}


	public Double getTotalprice() {
		return totalprice;
	}


	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}


	public Date getItemSoldDate() {
		return itemSoldDate;
	}


	public void setItemSoldDate(Date itemSoldDate) {
		this.itemSoldDate = itemSoldDate;
	}

}

//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	
//}