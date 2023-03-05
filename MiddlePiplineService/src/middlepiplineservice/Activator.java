package middlepiplineservice;

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
		System.out.println("Common producer Start");
		ICommon common = new CommonServiceImp();
		publishserviceregistraion =  bundleContext.registerService(ICommon.class.getName(),common, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Common producer Stop");
		publishserviceregistraion.unregister();
	}

}
