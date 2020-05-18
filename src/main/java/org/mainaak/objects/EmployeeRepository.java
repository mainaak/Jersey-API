package org.mainaak.objects;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class EmployeeRepository {
    private List<Employee> employeeList;

    public EmployeeRepository() {
        Employee[] employee = {new Employee("Mainaak", "Delhi"),
                new Employee("Ramesh", "Kolkata")};

        employeeList = new LinkedList<>(Arrays.asList(employee));
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee getEmployee(String employeeName) {
        for (Employee item : employeeList) {
            if (item.getEmployeeName().equals(employeeName)) {
                return item;
            }
        }
        return null;
    }

    public void createEmployee(Employee payload) {
        employeeList.add(payload);
        System.out.println(payload);
    }
}
