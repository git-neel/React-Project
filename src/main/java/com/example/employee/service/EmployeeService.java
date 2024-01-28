package com.example.employee.service;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository EmployeeRepository;

    public List<Employee> getAllEmployee() {
        return EmployeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return EmployeeRepository.findById(id).orElse(null);
    }

    public Employee createEmployee(Employee Employee) {
        return EmployeeRepository.save(Employee);
    }

    public Employee updateEmployee(Long id, Employee Employee) {
        Employee existingEmployee = EmployeeRepository.findById(id).orElse(null);
        if (existingEmployee != null) {
            // Update entity properties
            // ...

            return EmployeeRepository.save(existingEmployee);
        }
        return null;
    }

    public void deleteEmployee(Long id) {
        EmployeeRepository.deleteById(id);
    }
}
