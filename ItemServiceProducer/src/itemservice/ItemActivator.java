package itemservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ItemActivator implements BundleActivator {

	private static BundleContext context;
	ServiceRegistration itemServiceRegistration;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		ItemActivator.context = bundleContext;
		System.out.println("Item producer start");
		ItemPublish itemPublisher = new ItemPublishImpl();
		itemServiceRegistration = context.registerService(ItemPublish.class.getName(),itemPublisher, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		ItemActivator.context = null;
		System.out.println("Item producer Stopped");
		itemServiceRegistration.unregister();
		
	}

}
