package com.example.employee.Service;

import java.util.List;

import com.example.employee.Entity.Employee;

public interface EmployeeService {
    // To Display all the employees
    List<Employee> showAll();

    // Saves the employee data
    Employee saveEmployee(Employee employee);

    // To find the employee using id
    Employee findById(Integer id);

    // Delete an employee
    void deleteById(Integer id);

    // Delete every employee
    int deleteAll();
}
