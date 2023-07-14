package com.vanguard.empmongo.service;

import com.vanguard.empmongo.models.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    public List<Employee> getAllEmployee();
}
