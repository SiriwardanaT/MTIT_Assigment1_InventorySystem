package itemservice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ItemPublishImpl implements ItemPublish {
	ArrayList<ItemModel> itemList = new ArrayList<ItemModel>();
	Scanner sc = new Scanner(System.in);

	/**
	 * default constructor
	 */
	public ItemPublishImpl() {
	}

	public boolean createItem() {
		// TODO Auto-generated method stub
		
		ItemModel item = new ItemModel();
		char continuation = 'y';
		while(continuation == 'y') {
			    System.out.println("----------------Add new Item----------------");
			    System.out.print("Enter item ID: ");
				int id = Integer.parseInt(sc.next());
			    item.setItemId(id);
				System.out.print("Enter item name: ");
				item.setItemName(sc.next());
				System.out.print("Enter item quantity: ");
				int qty = Integer.parseInt(sc.next());
			    item.setQuantity(qty);
			    System.out.print("Enter imported date: ");
				item.setDate(sc.next());
				System.out.println("Enter avaiability");
				boolean val = Boolean.parseBoolean(sc.next());
				item.setAvaiability(val);
				
				 try {
						itemList.add(item);
						System.out.println("'"+item.getItemName()+"' "+"Item added successfully...");
						System.out.println("Do you want to add another item? (y/n) ");
						continuation = (sc.next().charAt(0));
						if(continuation == 'y') {
							continuation = 'y';
						}
						else if(continuation == 'n') {
							System.out.println("");
							break;
						}
					}catch(Exception e) {
						e.printStackTrace();
						System.out.println("Error!. Failed to add the item");
					}
		}
		
	  

	return false;
		
	}

	@Override
	public boolean getAllItems() {
		// TODO Auto-generated method stub
//		ItemModel item = new ItemModel();
		
		if(itemList.isEmpty() == true) {
			System.out.println("No items to show ");
			
		}
		for(ItemModel item: itemList) {
			this.displayItemDetails(item);
		}
		return true;
	}
	
	public void displayItemDetails(ItemModel item) {
		System.out.println("Item ID: "+item.getItemId());
		System.out.println("Item Name: "+item.getItemName());
		System.out.println("Item Quantity: "+item.getQuantity());
		System.out.println("Date: "+item.getDate());
		System.out.println("Availability"+item.isAvaiability());
		System.out.println("-------------------------");
	}

	@Override
	public boolean getAvailableItems() {
		// TODO Auto-generated method stub;
//		ItemModel item = new ItemModel();
	
		for(ItemModel item: itemList) {
			if(item.isAvaiability() == true) {
				System.out.println("Item ID: "+item.getItemId());
				System.out.println("Item Name: "+item.getItemName());
				System.out.println("Item Quantity: "+item.getQuantity());
				System.out.println("Date: "+item.getDate());
				System.out.println("Availability"+item.isAvaiability());
				System.out.println("-------------------------");
			}
		}
		return true;
	}

	@Override
	public boolean getTodayImportedItem() {
		// TODO Auto-generated method stub
		
//		ItemModel item = new ItemModel();
		
			
		for(ItemModel item: itemList) {
			String dd  = item.getDate();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date dateFinal = null;
			try {
				dateFinal = formatter.parse(dd);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			LocalDate today = LocalDate.now();
			Date todaydate = Date.from(today.atStartOfDay(ZoneId.systemDefault()).toInstant());


			if(dateFinal.compareTo(todaydate) == 0) {
				System.out.println("Item ID: "+item.getItemId());
				System.out.println("Item Name: "+item.getItemName());
				System.out.println("Item Quantity: "+item.getQuantity());
				System.out.println("Date: "+item.getDate());
				System.out.println("-------------------------");
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		ItemPublishImpl i = new ItemPublishImpl();
		
		i.createItem();
		
	}
	
}
