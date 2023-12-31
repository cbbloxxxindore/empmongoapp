package com.vanguard.empmongo.service;

import com.vanguard.empmongo.models.Employee;
import com.vanguard.empmongo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl  implements  EmployeeService{
     private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
