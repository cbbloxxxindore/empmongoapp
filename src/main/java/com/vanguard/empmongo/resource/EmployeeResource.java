package com.vanguard.empmongo.resource;

import com.vanguard.empmongo.models.Employee;
import com.vanguard.empmongo.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeResource {
    private EmployeeService employeeService;
    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }



    @PostMapping("/employees")
    public ResponseEntity<Employee> createemployee(@RequestBody Employee employee)
    {
        return ResponseEntity.ok(employeeService.saveEmployee(employee));

    }
    @GetMapping ("/employees")
    public ResponseEntity<List<Employee>> getEmployee()
    {
        return ResponseEntity.ok(employeeService.getAllEmployee());

    }
}
