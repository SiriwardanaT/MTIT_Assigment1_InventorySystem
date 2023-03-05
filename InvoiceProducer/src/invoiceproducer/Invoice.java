package invoiceproducer;

public class Invoice {
	
	private String Invoice_No;
	private String CustomerId;
	private String orderId;
	private String InvoiceDate;
	private double Amount;
    private String IsReturn;
    
	public Invoice(String invoice_No, String customerId, String orderId, String invoiceDate, double amount, String isReturn) {
		super();
		Invoice_No = invoice_No;
		CustomerId = customerId;
		this.orderId = orderId;
		InvoiceDate = invoiceDate;
		Amount = amount;
		IsReturn = isReturn;
	}
	
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getInvoice_No() {
		return Invoice_No;
	}

	public void setInvoice_No(String invoice_No2) {
		Invoice_No = invoice_No2;
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getInvoiceDate() {
		return InvoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		InvoiceDate = invoiceDate;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public String getIsReturn() {
		return IsReturn;
	}

	public void setIsReturn(String isReturn) {
		IsReturn = isReturn;
	}
	
}
