package com.cts.springdatajpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cts.springdatajpademo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // No need to add methods unless you want custom queries
}
