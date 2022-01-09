package com.testprima.testprima.service;
import org.springframework.stereotype.Component;
import com.testprima.testprima.entity.Employee;
@Component
public interface EmployeeService {
    public Employee findByEmployeeId(int employeeId);
}