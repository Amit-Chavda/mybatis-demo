package com.mybatisdemo.service;

import com.mybatisdemo.entity.Employee;
import com.mybatisdemo.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeMapper employeeMapper;

    public List<Employee> getAllEmployee() {
        return employeeMapper.findAll();
    }

    public Employee getEmployeeById(long employeeId) {
        return employeeMapper.findById(employeeId);
    }

    public void createEmployee(Employee employee) {
        employeeMapper.insert(employee);
    }

    public HttpStatus updateEmployee(Employee employee) {
        if (employeeMapper.existsById(employee.getId())) {
            employeeMapper.update(employee);
            return HttpStatus.OK;
        }
        return HttpStatus.NOT_FOUND;
    }
}
