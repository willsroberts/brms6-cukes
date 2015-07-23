package com.willsroberts.brms;

import java.util.HashSet;
import java.util.Set;

/**
 * @author RHC
 *
 */
public class FactsCollection  {
	
	private Set<Object> facts = new HashSet<>();

	public Set<Object> getFacts() {
		return facts;
	}

	public void setFacts(Set<Object> facts) {
		this.facts = facts;
	}
	
	
}
