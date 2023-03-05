package orderpublisher;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class OrderPublisherImpl implements OrderPublish {
	Scanner sc = new Scanner(System.in);
	ArrayList<OrderModel> orderList = new ArrayList<OrderModel>();

	/**
	 * default constructor
	 */
	public OrderPublisherImpl() {
	}
	
	@Override
	public void addNewOrder() {	
			OrderModel order = new OrderModel();
			char continuation = 'y';
			while(continuation == 'y') {
				System.out.println("----------------Add new order details----------------");
				System.out.println("Enter Order Number: ");
				order.setOrderNumber(sc.next());
				
				System.out.println("Enter Shipping Date(yyyy-MM-dd): ");
				order.setShippingDate(sc.next().trim());
				
				System.out.println("Enter To Be Delivered Date (yyyy-MM-dd): ");
				order.setDeliveredDate(sc.next());

				System.out.println("Enter Shipping Address: ");
				order.setAddress(sc.next());
					
				try {
				    orderList.add(order);
					System.out.println(".......................Order added successfully..............");	
					System.out.println("Do you want to add another Order? (y/n) ");
					continuation = (sc.next().charAt(0));
					if(continuation == 'y') {
						continuation = 'y';
						System.out.println("Again ");
						
					}
					else if(continuation == 'n') {
						System.out.println("Exit........");
						break;
					}
				}
				catch(Exception e) {
					e.printStackTrace();
					System.out.println("Error!. Failed to add the item");
				}
			}					
	}
	
	@Override
	public boolean getAllOrders() {
		// TODO Auto-generated method stub		
		if(orderList.isEmpty() == true) {
			System.out.println(".........................No Orders to show ................... ");
			
		}
		for(OrderModel order: orderList) {
			this.displayOrderDetails(order);
		}
		return true;
	}
	
	public void displayOrderDetails(OrderModel order) {
		System.out.println("==============================All Orders================================");
		System.out.println("Order Number --------> "+order.getOrderNumber());
		System.out.println("Order Shipping Date --------> "+order.getShippingDate());
		System.out.println("Order To Be Delivered Date --------> "+order.getDeliveredDate());
		System.out.println("Shipping Address --------> "+order.getAddress());
		System.out.println("========================================================================");
	}
	
	@Override
    public void searchOrderByShippingDate() throws ParseException {
        System.out.println("Enter the shipping date (yyyy-MM-dd): ");
        String input = sc.next().trim();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date dateFinal = null;
        dateFinal = formatter.parse(input);

        //LocalDate shippingDate = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        List<OrderModel> matchingOrders = new ArrayList<>();
        for (OrderModel order : orderList) {
        	 Date date2 = formatter.parse(order.getShippingDate());
            if (dateFinal.compareTo(date2)== 0) {
                matchingOrders.add(order);
            }
        }
        if (matchingOrders.isEmpty()) {
            System.out.println("No orders found for the specified shipping date.");
        } else {
            System.out.println("Matching orders:");
            for (OrderModel order : matchingOrders) {
                displaySpecificDateOrderDetails(order);
            }
        }
    }
	public void displaySpecificDateOrderDetails(OrderModel order) {
		System.out.println("==============================All Orders================================");
		System.out.println("Order Number --------> "+order.getOrderNumber());
		System.out.println("Order Shipping Date --------> "+order.getShippingDate());
		System.out.println("Order To Be Delivered Date --------> "+order.getDeliveredDate());
		System.out.println("Shipping Address --------> "+order.getAddress());
		System.out.println("========================================================================");
	}
	
	
	
	  public static void main(String [] ask) { OrderPublisherImpl
	  orderPublisherImpl = new OrderPublisherImpl();
	  orderPublisherImpl.addNewOrder();
	  orderPublisherImpl.getAllOrders();
	  
	 }

	
   }