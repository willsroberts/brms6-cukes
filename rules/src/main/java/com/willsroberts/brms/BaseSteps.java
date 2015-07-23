package com.willsroberts.brms;

import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = { "classpath*:cucumber.xml" })
public class BaseSteps {

    protected static FactsCollection factsCollection = new FactsCollection();

	public FactsCollection getFactsCollection() {
		return factsCollection;
	}

	public void setFactsCollection(FactsCollection factsCollection) {
		this.factsCollection = factsCollection;
	}
	
}
