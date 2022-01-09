package com.testprima.testprima.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.testprima.testprima.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
	public Employee findByEmployeeId(int employeeId);
}