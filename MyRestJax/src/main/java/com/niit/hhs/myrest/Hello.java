package com.niit.hhs.myrest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello()
	{
		return "Hello Jersey plain";
	}
	@GET
	@Path("/xmlhello")
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHELLO()
	{
		return "<?xml version=\"1.0\"?>"+"<hello> Hello Jersey"+"</hello>";
	}

	@GET
	@Path("/htmlhello")
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello()
	{
		return "<HTML>"+"<TITLE>"+"HELLO JERSEY"+"</TITLE>"+"<BODY><H1>"+"Hello Jersy HTML"+"</H1></BODY>"+"</HTML>";
	}
}
