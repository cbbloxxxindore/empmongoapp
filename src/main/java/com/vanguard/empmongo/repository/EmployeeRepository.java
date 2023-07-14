package com.vanguard.empmongo.repository;

import com.vanguard.empmongo.models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends MongoRepository<Employee,Integer> {
}
