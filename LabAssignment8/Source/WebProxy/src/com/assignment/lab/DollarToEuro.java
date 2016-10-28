package com.assignment.lab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/DollarToEuro")
public class DollarToEuro {
	@GET
	@Produces("application/xml")
	public String kmtom(){
		 
		Double d =1.0;
		Double e;
		
		e=d*0.92;
		
		String result = "Output: Dollar To Euro\n" + e;
		return "<DollarToEuro>" + "<Dollar>" + d + "</Dollar>" + "<output>" + result + "</output>" + "</DollarToEuro>";
		
	}
		@Path("{d}")
		@GET
		@Produces("application/xml")
		
		public String DollarConvert(@PathParam("d") Double d) {
			Double e=d*0.92;
			
			String result = "Output: Dollar To Euro\n" + e;
			return "<DollarToEuro>" + "<Dollar>" + d + "</Dollar>" + "<output>" + result + "</output>" + "</DollarToEuro>";
		}
}

