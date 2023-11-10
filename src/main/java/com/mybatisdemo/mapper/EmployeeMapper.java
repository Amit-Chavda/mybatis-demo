package com.mybatisdemo.mapper;

import com.mybatisdemo.entity.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    List<Employee> findAll();

    boolean existsById(@Param("id") Long id);

    @Result(property = "id", column = "id")
    @Result(property = "firstName", column = "first_name")
    @Result(property = "lastName", column = "last_name")
    @Result(property = "emailId", column = "email_address")
    @Select("SELECT * FROM employees WHERE id = #{id}")
    Employee findById(long id);

    @Delete("DELETE FROM employees WHERE id = #{id}")
    int deleteById(long id);

    @Insert("INSERT INTO employees(first_name, last_name,email_address) VALUES (#{firstName}, #{lastName}, #{emailId})")
    void insert(Employee employee);

    @Update("Update employees set first_name=#{firstName},last_name=#{lastName}, email_address=#{emailId} where id=#{id}")
    void update(Employee employee);

    @Result(property = "id", column = "id")
    @Result(property = "firstName", column = "first_name")
    @Result(property = "lastName", column = "last_name")
    @Result(property = "emailId", column = "email_address")
    @Select("SELECT * FROM employees WHERE department_id = #{departmentId}")
    List<Employee> getEmployeesByDepartmentId(long departmentId);
}
