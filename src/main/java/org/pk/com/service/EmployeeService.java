package org.pk.com.service;

import org.pk.com.domain.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id) throws Exception;

    Employee createOrUpdateEmployee(Employee employee) throws Exception;

    void deleteEmployeeById(Long id) throws Exception;
}
