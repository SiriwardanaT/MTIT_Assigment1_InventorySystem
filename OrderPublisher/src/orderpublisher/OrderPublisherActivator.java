package orderpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class OrderPublisherActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
    @Override
	public void start(BundleContext context) throws Exception {		
		System.out.println("Order producer started...\n");
		OrderPublish orderPublisher = new OrderPublisherImpl();
		publishServiceRegistration = context.registerService(OrderPublish.class.getName(), orderPublisher, null);
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {		
		System.out.println("Order producer stopped...\n");
		publishServiceRegistration.unregister();
	}

}
