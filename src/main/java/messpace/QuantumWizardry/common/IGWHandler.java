package messpace.QuantumWizardry.common;

import igwmod.api.WikiRegistry;

public class IGWHandler {
	
	public static void init() {
		WikiRegistry.registerWikiTab(new IGWTab());
	}

}
