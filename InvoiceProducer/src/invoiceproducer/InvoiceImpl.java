package invoiceproducer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvoiceImpl implements IInvoice {
    ArrayList<Invoice> invoiceList;
    Scanner in = new Scanner(System.in);
    
    public InvoiceImpl() {
    	
    }

	@Override
	public void createInvoice() {
	    System.out.println("========  Please Create New Invoice ===============");
	    invoiceList = new ArrayList<Invoice>();
	    String anotherRec = "Y";
	    
	    do
	    {
	    	Invoice invoice = new Invoice();
	    	
	    	System.out.println("Enter Invoice No   : ===> ");
		    String Invoice_No = in.nextLine(); 
		    invoice.setInvoice_No(Invoice_No);
		    
		    System.out.println("Enter Customer ID  : ===> ");
		    String CustomerId = in.nextLine();
		    invoice.setCustomerId(CustomerId);
		    
		    System.out.println("Enter Order ID  : ===> ");
		    String orderId = in.nextLine();
		    invoice.setOrderId(orderId);
		    
		    System.out.println("Enter Invoice Date : ===> ");
		    String InvoiceDate = in.nextLine();
		    invoice.setInvoiceDate(InvoiceDate);
		    
		    System.out.println("Enter InvoiceorderAmount  : ===> ");
		    double Amount = Double.parseDouble(in.nextLine());
		    invoice.setAmount(Amount);
		    
		    System.out.println("Is this return ?  : ===> ");
		    String IsReturn = in.nextLine();
		    invoice.setIsReturn(IsReturn);
		    
		    invoiceList.add(invoice);
		    System.out.println("Invoice Created Successfully..");
		    
		    System.out.println("Do you want to create another invoice (Y/N)");
		    anotherRec = in.nextLine();
	    }
	    while(anotherRec.equalsIgnoreCase("Y"));
	    
	}

	@Override
	public List<Invoice> getReturnInvoice() {
		
		if(invoiceList.isEmpty()) {
			System.out.println("Sorry . No Invoice found");
		}
		else {
			for(Invoice inv : invoiceList) {
				 System.out.println("=========    Return Invoice List    ===============");
				 if(inv.getIsReturn().equalsIgnoreCase("YES")) {
					
					 System.out.println("");
					 System.out.println("");
					 
					 System.out.println("=========    Invoice  ID   : "+" " + inv.getInvoice_No());
					 System.out.println("=========    Customer ID   : " + " "+ inv.getCustomerId());
					 System.out.println("=========    Order    ID   : " + " "+ inv.getOrderId());
					 System.out.println("=========    Invoice Amount ID   : " + " "+ inv.getAmount());
					 System.out.println("=========    Is Return   : " + " "+ inv.getIsReturn());
					 
					 System.out.println("");
					 System.out.println("");
					 
				 }
				  
			 }
		}
		return null;
	}
	

	@Override
	public List<Invoice> getAllInvoiceList() {
		
		if(invoiceList.isEmpty()) {
			System.out.println("Sorry . No Invoice found");
		}
		else {
			System.out.println("=========    Invoice List    ===============");
			 for(Invoice inv : invoiceList) {
				 
				 System.out.println("");
				 System.out.println("");
				 
				 System.out.println("=========    Invoice  ID   : "+" " + inv.getInvoice_No());
				 System.out.println("=========    Customer ID   : " + " "+ inv.getCustomerId());
				 System.out.println("=========    Order    ID   : " + " "+ inv.getOrderId());
				 System.out.println("=========    Invoice Amount ID   : " + " "+ inv.getAmount());
				 
				 System.out.println("");
				 System.out.println("");
				 
			 }
		}
		
		 return null;
	}

	@Override
	public Invoice InvoiceByOrderId() {
		System.out.println("Enter Order No   : ===> ");
	    String orderID = in.nextLine(); 
	    
	    for(Invoice inv :invoiceList) {
	    	 if(inv.getOrderId().equalsIgnoreCase(orderID)) {
	    		 System.out.println("=========    Invoice  for the "+ " "+"Order"+ orderID);
	    		 System.out.println("");
	    		 System.out.println("=========    Invoice  ID   : "+" " + inv.getInvoice_No());
				 System.out.println("=========    Customer ID   : " + " "+ inv.getCustomerId());
				 System.out.println("=========    Order    ID   : " + " "+ inv.getOrderId());
				 System.out.println("=========    Invoice Amount ID   : " + " "+ inv.getAmount());
				 
				 break;
	    	 }
	    }
	    
		return null;
	}
	

}
