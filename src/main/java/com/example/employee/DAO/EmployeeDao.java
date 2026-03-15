package com.example.employee.DAO;

import java.util.List;

import com.example.employee.Entity.Employee;

public interface EmployeeDao {

    // Saves the employee data
    Employee saveEmployee(Employee employee);

    // To find the employee using id
    Employee findById(Integer id);

    // To Display all the employees
    List<Employee> showAll();

    // Delete an employee
    void deleteById(Integer id);

    // Delete every employee
    int deleteAll();

}
