package com.example.employee.repository;

import com.example.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for managing Employee entities.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Additional custom queries...

}
