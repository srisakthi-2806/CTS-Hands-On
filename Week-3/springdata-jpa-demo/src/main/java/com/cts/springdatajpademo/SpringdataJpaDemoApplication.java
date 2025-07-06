package com.cts.springdatajpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.springdatajpademo.model.Employee;
import com.cts.springdatajpademo.service.EmployeeService;

@SpringBootApplication
public class SpringdataJpaDemoApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(SpringdataJpaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee emp = new Employee();
        emp.setName("Sri Sakthi");
        emp.setDepartment("IT");
        emp.setSalary(50000);

        employeeService.addEmployee(emp);

        System.out.println("Employee added successfully!");
    }
}
