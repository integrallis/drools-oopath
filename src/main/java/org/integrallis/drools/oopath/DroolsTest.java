package org.integrallis.drools.oopath;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
            Person brian = new Person("Brian Sam-Bodden");
            brian.setAddress(new Address("10544", "East Meadowhill Drive", "Scottsdale", "AZ", "85255"));
            
            Person john = new Person("John Smith");
            john.setAddress(new Address("2122", "S Hacienda Blvd", "Hacienda Heights", "CA", "91745"));
            
            Company kkScottsdaleSheaAZ = new Company("Krispy Kream Shea/Scottsdale/AZ");
            kkScottsdaleSheaAZ.addLocation(new Address("7055", "E Shea Blvd", "Scottsdale", "AZ", "85254"));
            
            Company kkCoIAzusaAZ = new Company("Krispy Kream Azusa/CoI/CA");
            kkCoIAzusaAZ.addLocation(new Address("1548", "Azusa Avenue", "City of Industry", "CA", "91748"));
            
            kSession.insert(brian);
            kSession.insert(john);
            kSession.insert(kkScottsdaleSheaAZ);
            kSession.insert(kkCoIAzusaAZ);
            
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
