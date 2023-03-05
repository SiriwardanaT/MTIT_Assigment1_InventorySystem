package caseservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class CaseActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Case producer Start...");
		ICaseService casePublisher = new CaseServiceImpl();
		publishServiceRegistration = bundleContext.registerService(ICaseService.class.getName(), casePublisher, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Case producer stop...");
		publishServiceRegistration.unregister();
	}

}
