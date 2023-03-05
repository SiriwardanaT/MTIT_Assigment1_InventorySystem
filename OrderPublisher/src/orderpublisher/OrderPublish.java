package orderpublisher;

import java.text.ParseException;

public interface OrderPublish {
		public void addNewOrder();
		public boolean getAllOrders();
		public void searchOrderByShippingDate() throws ParseException;
		
}
