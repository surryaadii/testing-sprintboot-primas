package com.testprima.testprima.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testprima.testprima.entity.Employee;
import com.testprima.testprima.repository.EmployeeRepository;
import com.testprima.testprima.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public Employee findByEmployeeId(int employeeId) {
        Employee employee = employeeRepository.findByEmployeeId(employeeId);
        return employee;
    }
}