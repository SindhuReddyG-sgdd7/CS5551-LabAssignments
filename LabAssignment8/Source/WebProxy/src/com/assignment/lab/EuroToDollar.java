package com.assignment.lab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("/EuroToDollar")
public class EuroToDollar {
	@GET
	@Produces("application/xml")
	public String EToD(){
		 
		Double e = 1.0;
		Double d;
		
		d = e*1.09;
		
		String result="Output: Euro To Dollar \n\n" + d;
		return "<EuroToDollar>" + "<Euro>" + e + "</Euro>" + "<output>" + result + "</output>" + "</EuroToDollar>";
		
	}
		@Path("{e}")
		@GET
		@Produces("application/xml")
		
		public String DollarConvert(@PathParam("e") Double e) {
			Double d;
			
			d = e*1.09;
			
			String result="Output: Euro To Dollar \n\n" + d;
			return "<EuroToDollar>" + "<Euro>" + e + "</Euro>" + "<output>" + result + "</output>" + "</EuroToDollar>";
			}

}

