package invoiceproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	private static BundleContext context;
    ServiceRegistration publishserviceregistraion;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Invoice producer Start..");
		IInvoice invoice = new InvoiceImpl();
		publishserviceregistraion =  bundleContext.registerService(IInvoice.class.getName(),invoice, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Invoice producer Stopped..");
		publishserviceregistraion.unregister();
	}

}
