package itemservice;

import java.sql.Date;

public class ItemModel {
	private int itemId;
	private String itemName;
	private int quantity;
	private String date;
	private boolean avaiability;
	
	
	
	public ItemModel() {
		super();
	}

	public ItemModel(int itemId, String itemName, int quantity, String date,boolean avaiability) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.date = date;
		this.avaiability = avaiability;
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public boolean isAvaiability() {
		return avaiability;
	}

	public void setAvaiability(boolean avaiability) {
		this.avaiability = avaiability;
	}

	
	
	
	

}
