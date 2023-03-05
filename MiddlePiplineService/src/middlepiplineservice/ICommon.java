package middlepiplineservice;

import caseservice.ICaseService;
import invoiceproducer.IInvoice;
import itemservice.ItemPublish;
import orderpublisher.OrderPublish;

public interface ICommon {
	
//	public void selectConsumer();
	public void selectAdminOptions(IInvoice i , ItemPublish p , ICaseService c,OrderPublish o);
	public void selectSuplierOptions(IInvoice i , ItemPublish p , ICaseService c,OrderPublish o);
	public void selectTrasportorOptions(IInvoice i , ItemPublish p , ICaseService c,OrderPublish o);
	public void selectCustomerOptions(IInvoice i , ItemPublish p , ICaseService c,OrderPublish o);

}
