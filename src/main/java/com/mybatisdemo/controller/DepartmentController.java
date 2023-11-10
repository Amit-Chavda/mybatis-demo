package com.mybatisdemo.controller;


import com.mybatisdemo.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<Object> getAllDepartment() {
        return new ResponseEntity<>(departmentService.getAllDepartment(), HttpStatus.OK);
    }

    @GetMapping("/{departmentId}")
    public ResponseEntity<Object> getDepartmentById(@PathVariable long departmentId) {
        return new ResponseEntity<>(departmentService.getDepartmentById(departmentId), HttpStatus.OK);
    }
}
