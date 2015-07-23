package com.willsroberts.brms;

import org.kie.api.KieServices;
import org.kie.api.event.rule.DebugAgendaEventListener;
import org.kie.api.event.rule.DebugRuleRuntimeEventListener;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * 
 *
 * This sample class to launch a rule utilizes three components for doing so.
 * First) it pulls the KieSession configurations, by name, from the kmodule.xml.
 * That KieSession includes the rules by specifying the rules pa
 *
 *
 */
public class RulesEngine extends BaseSteps {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices 	ks 				= KieServices.Factory.get();
    	    KieContainer 	kContainer 		= ks.getKieClasspathContainer();
        	KieSession 		kSession 		= kContainer.newKieSession("ksession-rules");

        	ks.getLoggers().newFileLogger( kSession, "RULES LOGGER" );
        	
        	kSession.addEventListener( new DebugRuleRuntimeEventListener() );
        	kSession.addEventListener( new DebugAgendaEventListener() );

            
        	for ( Object O : factsCollection.getFacts() ){
        		kSession.insert( O );
        	}
            
            kSession.fireAllRules();
            
            
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
