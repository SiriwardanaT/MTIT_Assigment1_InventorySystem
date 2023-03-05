package adminconsumer;

import caseservice.ICaseService;
import invoiceproducer.IInvoice;
import itemservice.ItemPublish;
import java.util.Scanner;
import middlepiplineservice.CommonServiceImp;
import middlepiplineservice.ICommon;
import orderpublisher.OrderPublish;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;



public class Activator implements BundleActivator {

	private static BundleContext context;
	ServiceReference invoiceReference;
	ServiceReference caseReference;
	ServiceReference itemreference;
	ServiceReference orderReference;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		 System.out.println("Admin Consumer Started...");
		 
		 invoiceReference = bundleContext.getServiceReference(IInvoice.class.getName());
		 IInvoice invoice =  (IInvoice) bundleContext.getService(invoiceReference);
		 
		 caseReference = bundleContext.getServiceReference(ICaseService.class.getName());
		 ICaseService cases =  (ICaseService) bundleContext.getService(caseReference);
		 
		 itemreference = bundleContext.getServiceReference(ItemPublish.class.getName());
		 ItemPublish items =  (ItemPublish) bundleContext.getService(itemreference);
	 
		 orderReference = bundleContext.getServiceReference(OrderPublish.class.getName());
		 OrderPublish order =  (OrderPublish) bundleContext.getService(orderReference);
		 
		 ICommon i = new CommonServiceImp();
		 i.selectAdminOptions(invoice, items, cases, order);
		 
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Admin Consumer Stopped...");
		bundleContext.ungetService(invoiceReference);
	}

}
