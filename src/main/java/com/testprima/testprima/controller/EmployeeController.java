package com.testprima.testprima.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.testprima.testprima.entity.Employee;
import com.testprima.testprima.service.EmployeeService;
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(value = "/{employeeId}", method = RequestMethod.GET)
    @ResponseBody
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee employeeResponse = employeeService.findByEmployeeId(employeeId);
        return employeeResponse;
    }
}