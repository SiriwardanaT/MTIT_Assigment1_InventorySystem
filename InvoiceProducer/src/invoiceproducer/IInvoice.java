package invoiceproducer;

import java.util.List;

public interface IInvoice {
	
	public void createInvoice();
	public List<Invoice> getAllInvoiceList();
	public List<Invoice> getReturnInvoice();
	public Invoice InvoiceByOrderId();

}
