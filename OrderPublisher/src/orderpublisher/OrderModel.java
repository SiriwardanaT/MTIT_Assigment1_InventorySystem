package orderpublisher;
import java.sql.Date;

public class OrderModel {
	private String orderNumber, shippingDate, deliveredDate, address;

	/**
	 * constructor
	 */
	public OrderModel() {
		// TODO Auto-generated constructor stub
	}

	public OrderModel(String orderNumber, String shippingDate, String deliveredDate, String address) {
		super();
		this.orderNumber = orderNumber;
		this.shippingDate = shippingDate;
		this.deliveredDate = deliveredDate;
		this.address = address;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getShippingDate() {
		return shippingDate;
	}

	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}

	public String getDeliveredDate() {
		return deliveredDate;
	}

	public void setDeliveredDate(String deliveredDate) {
		this.deliveredDate = deliveredDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
