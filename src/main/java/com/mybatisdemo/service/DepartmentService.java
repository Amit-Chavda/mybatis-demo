package com.mybatisdemo.service;

import com.mybatisdemo.entity.Department;
import com.mybatisdemo.entity.Employee;
import com.mybatisdemo.mapper.DepartmentMapper;
import com.mybatisdemo.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentMapper departmentMapper;

    public List<Department> getAllDepartment() {
        return departmentMapper.findAll();
    }

    public Department getDepartmentById(long departmentId) {
        return departmentMapper.findById(departmentId);
    }
}
