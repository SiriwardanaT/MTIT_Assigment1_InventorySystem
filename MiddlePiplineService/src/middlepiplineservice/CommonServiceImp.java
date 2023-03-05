package middlepiplineservice;

import caseservice.CaseServiceImpl;
import caseservice.ICaseService;
import invoiceproducer.IInvoice;
import invoiceproducer.InvoiceImpl;
import itemservice.ItemPublish;
import itemservice.ItemPublishImpl;

import java.text.ParseException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;
import orderpublisher.OrderPublish;
import orderpublisher.OrderPublisherImpl;

public class CommonServiceImp implements ICommon {
	
	
	IInvoice invoice;
	ItemPublish itemPublish;
	ICaseService _icaseService;
	OrderPublish orderPublish;
		
	public CommonServiceImp() {
		invoice = new InvoiceImpl();
		itemPublish = new ItemPublishImpl();
		_icaseService = new CaseServiceImpl();
		orderPublish = new OrderPublisherImpl();
	}

	


	@Override
	public void selectAdminOptions(IInvoice i , ItemPublish p , ICaseService c,OrderPublish o) {
		
		// TODO Auto-generated method stub
		System.out.println("====  Welcome to the Invent HUB ==== ");
		System.out.println("====  Login As Admin ==== ");
		System.out.println("====  Select an option to operate ==== ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("=========== Import Item section  ============ ");
		System.out.println("Enter 1 - Add New Item for Inventory ");
		System.out.println("Enter 2 - View All Inventory Items ");
		System.out.println(" ");
		System.out.println("=========== Order section  ============ ");
		System.out.println("Enter 3 - Create New Order ");
		System.out.println("Enter 4 - View All Availble Orders ");
		System.out.println(" ");
		System.out.println("=========== Invoice section  ============ ");
		System.out.println("Enter 5 - Create New Invoice ");
		System.out.println("Enter 6 - View All Invoices ");
		
		System.out.println("=========== Cases Section ============ ");
		System.out.println(" ");
		System.out.println("Enter 7 - View All Cases ");
		System.out.println("Enter 8 - Go to the menu");
		System.out.println("Enter -1 - Exit");
		
		
		System.out.println("Please Select an Option");
		String key = "";
		boolean ex = true;
        do {
        	Scanner in = new Scanner(System.in);   
            key = in.nextLine();  
            if(key.equals("1")) {
            	p.createItem();
            }
            else if(key.equals("2")) {
            	p.getAllItems();
            }
            else if(key.equals("3")) {
            	o.addNewOrder();
            }
            else if(key.equals("4")) {
            	o.getAllOrders();
            }
            else if(key.equals("5")) {
            	i.createInvoice();
            }
            else if(key.equals("6")) {
            	i.getAllInvoiceList();
            }
            else if(key.equals("7")) {
            	c.getAllCases();
            }
            else if(key.equals("-1")) {
            	ex = false;
            	break;
            }
            else if(key.equals("8")) {
            	ex= false;
            }
           
        }while(ex);
        
        if(key.equals("8")) {
        	selectAdminOptions(i,p,c,o);
        }
	}

	@Override
	public void selectSuplierOptions(IInvoice i , ItemPublish p , ICaseService c,OrderPublish o) {
		System.out.println("====  Login As Suplier ==== ");

		
		System.out.println("Enter 1 - Add New Item for Inventory ");
		System.out.println("Enter 2 - View All Inventory Items ");
		System.out.println("Enter 3 - Create New Order ");
		System.out.println("Enter 4 - Invoice according to the order ID ");
		System.out.println("Enter 5 - Create new Case");
		System.out.println("Enter 6 - Go to the menu");
		System.out.println("Enter -1 - Exit");
		
		
		System.out.println("Please Select an Option");
		String key = "";
		boolean ex = true;
        do {
        	Scanner in = new Scanner(System.in);   
            key = in.nextLine();  
            if(key.equals("1")) {
            	p.createItem();
            }
            else if(key.equals("2")) {
            	p.getAllItems();
            }
            else if(key.equals("3")) {
            	o.addNewOrder();
            }
            else if(key.equals("4")) {
            	//invoice by id
            	i.InvoiceByOrderId();
            	
            }
            else if(key.equals("5")) {
            	//case
            	c.createCases();
            }
           
            else if(key.equals("-1")) {
            	ex = false;
            	break;
            }
            else if(key.equals("6")) {
            	ex= false;
            }
           
        }while(ex);
        
        if(key.equals("6")) {
        	selectSuplierOptions(i,p,c,o);
        }
		
	}

	@Override
	public void selectTrasportorOptions(IInvoice i , ItemPublish p , ICaseService c,OrderPublish o) {
		
        System.out.println("====  Login As Trasportor==== ");

		
		System.out.println("Enter 1 - View Today Invetory Item to Trasport ");
		System.out.println("Enter 2 - View Return Invoices");
		System.out.println("Enter 3 - View Approved Invoices");
		System.out.println("Enter 4 - Create new Case");
		System.out.println("Enter 5 - Go to the menu");
		System.out.println("Enter -1 - Exit");
				
		System.out.println("Please Select an Option");
		String key = "";
		boolean ex= true;
        do {
        	Scanner in = new Scanner(System.in);   
            key = in.nextLine();  
            if(key.equals("1")) {
            	p.getTodayImportedItem();
            }
            else if(key.equals("2")) {
            	i.getReturnInvoice();
            }
            else if(key.equals("3")) {
            	i.getAllInvoiceList();
            }
            else if(key.equals("4")) {
            	c.createCases();
            }
            else if(key.equals("-1")) {
            	ex = false;
            	break;
            }
            else if(key.equals("5")) {
            	ex= false;
            }        
        }while(ex);
        
        if(key.equals("5")) {
        	selectTrasportorOptions(i,p,c,o);
        }
		
	}

	@Override
	public void selectCustomerOptions(IInvoice i , ItemPublish p , ICaseService c,OrderPublish o) {
		System.out.println("====  Login As Customer ==== ");

		
		System.out.println("Enter 1 - View Canceled Cases ");
		System.out.println("Enter 2 - View Case response ");
		System.out.println("Enter 3 - Create new Case ");
		System.out.println("Enter 4 - Serach Order by Shipping date ");
		System.out.println("Enter 5 - View My Invoice by Order ID ");
		System.out.println("Enter 6 - Delete Case by ID ");
		System.out.println("Enter 7 - go to menu");
		System.out.println("Enter -1 - Exit");
		
		
		System.out.println("Please Select an Option");
		String key = "";
		boolean ex = true;
        do {
        	Scanner in = new Scanner(System.in);   
            key = in.nextLine();  
            if(key.equals("1")) {
            	//case
            	c.getCancelCases();
            }
            else if(key.equals("2")) {
            	//case response;
            	c.getCaseResponse();
            }
            else if(key.equals("3")) {
            	c.createCases();
            }
            else if(key.equals("4")) {
            	try {
					o.searchOrderByShippingDate();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
            else if(key.equals("5")) {
            	i.InvoiceByOrderId();
            }
            else if(key.equals("6")) {
            	c.cancelCases();
            }
            else if(key.equals("-1")) {
            	ex = false;
            	break;
            }
            else if(key.equals("7")) {
            	ex= false;
            }
           
        }while(ex);
        
        if(key.equals("7")) {
        	selectCustomerOptions(i,p,c,o);
        }
        
	}
		
}
