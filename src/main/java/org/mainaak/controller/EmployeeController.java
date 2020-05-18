package org.mainaak.controller;

import org.mainaak.objects.Employee;
import org.mainaak.objects.EmployeeRepository;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

//Defines the path of the API
@Path("employee")
public class EmployeeController {

    EmployeeRepository employeeRepository = new EmployeeRepository();

    //Request type of the API
    @GET
    //Type of data to return in response
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getEmployeeList() {
        /*List<Employee> returnData = new LinkedList<>();
        returnData.add(employeeRepository.getEmployee("Ramesh"));*/
        return employeeRepository.getEmployeeList();
    }

    @POST
    @Path("create")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> createEmployee(Employee payload) {
        System.out.println("createEmployee() called");
        employeeRepository.createEmployee(payload);
        return employeeRepository.getEmployeeList();
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("enterNameAsParam")
    public Employee employeeByNameUsingQueryParam(@QueryParam("name") String empName){
        System.out.println("employeeByName() called");
        return employeeRepository.getEmployee(empName);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{nameOfEmployee}")
    public Employee employeeByNameUsingPathParam(@PathParam("nameOfEmployee") String empName){
        System.out.println("employeeByName() called");
        return employeeRepository.getEmployee(empName);
    }
}
