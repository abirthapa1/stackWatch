package com.example.employee.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.employee.Entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOImpl implements EmployeeDao {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // Saves the employee data
    public Employee saveEmployee(Employee employee) {
        return entityManager.merge(employee);
    }

    // To find the employee using id
    public Employee findById(Integer id) {
        return entityManager.find(Employee.class, id);
    }

    // To Display all the employees
    public List<Employee> showAll() {

        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);
        return theQuery.getResultList();
    }

    // Delete an employee
    public void deleteById(Integer id) {
        Employee theEmployee = entityManager.find(Employee.class, id);
        entityManager.remove(theEmployee);
    }

    // Delete every employee
    public int deleteAll() {
        return 1;
    }

}
