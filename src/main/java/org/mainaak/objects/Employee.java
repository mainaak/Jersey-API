package org.mainaak.objects;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement is needed to set the class Employee as the root of data in XML
@XmlRootElement
public class Employee {
    private String employeeName;
    private String employeeLocation;

    public Employee(String employeeName, String employeeLocation) {
        this.employeeName = employeeName;
        this.employeeLocation = employeeLocation;
    }

    public Employee(){
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeLocation() {
        return employeeLocation;
    }

    public void setEmployeeLocation(String employeeLocation) {
        this.employeeLocation = employeeLocation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeLocation='" + employeeLocation + '\'' +
                '}';
    }
}
