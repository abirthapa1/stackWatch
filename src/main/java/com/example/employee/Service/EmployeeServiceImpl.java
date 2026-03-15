package com.example.employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.DAO.EmployeeDao;
import com.example.employee.Entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> showAll() {
        return employeeDao.showAll();
    }

    @Transactional
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeDao.saveEmployee(employee);
    }

    // To find the employee using id
    public Employee findById(Integer id) {
        return employeeDao.findById(id);
    }

    // Delete an employee
    @Transactional
    @Override
    public void deleteById(Integer id) {
        employeeDao.deleteById(id);
    }

    // Delete every employee
    public int deleteAll() {
        return 1;
    }

}
