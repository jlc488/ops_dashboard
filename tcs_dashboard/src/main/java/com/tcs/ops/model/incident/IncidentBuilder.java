package com.tcs.ops.model.incident;

public class IncidentBuilder {

	
	public static IIncident init(){
		return new Incident(new IncidentBean());
	}
}
