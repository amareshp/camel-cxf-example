package com.visitamaresh.ws.demo;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 
 * @author lessonslab.com
 * This is interface for the employee services
 * 
 * WADL at - 
 * http://localhost:8080/camel-cxf-example/rest/employeeservices?_wadl
 * 
 * Access the service at - 
 * http://localhost:8080/camel-cxf-example/rest/employeeservices/getemployeedetail?employeeId=1
 * 
 * More info - 
 * http://www.lessonslab.com/building-restful-webservices-using-apache-cxf/150/
 * 
 */

@Path("/")
@WebService(name="employeeService", targetNamespace="http://www.lessonslab.com/cxf-rest/example")
public interface CxfRestService 
{
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/getemployeedetail")
	public Response getEmployeeDetail(@QueryParam("employeeId") String employeeId);

}
