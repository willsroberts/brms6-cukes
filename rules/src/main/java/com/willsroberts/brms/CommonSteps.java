package com.willsroberts.brms;

import cucumber.api.java.en.When;

public class CommonSteps extends BaseSteps {

    @When( "^the business rules are applied$" )
    public void business_rules_are_applied() throws Throwable {
    	
        RulesEngine.main(null);
        
    }

}