package com.employeeAPI.management.service;

import com.employeeAPI.management.model.Employee;
import com.employeeAPI.management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeServiceInterface
{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> getEmployeeById(int id)
    {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> getAllEmployee()
    {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(int id, Employee employee)
    {
        Employee empToUpdate = employeeRepository.findById(id).orElseThrow();

        empToUpdate.setFirstName(employee.getFirstName());
        empToUpdate.setLastName(employee.getLastName());
        empToUpdate.setEmail(employee.getEmail());

        return employeeRepository.save(empToUpdate);
    }

    @Override
    public void deleteEmployee(int id)
    {
        employeeRepository.deleteById(id);
    }
}
