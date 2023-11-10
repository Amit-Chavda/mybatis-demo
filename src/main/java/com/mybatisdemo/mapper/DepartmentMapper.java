package com.mybatisdemo.mapper;

import com.mybatisdemo.entity.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    List<Department> findAll();

    boolean existsById(@Param("id") Long id);

    @Result(property = "id", column = "id")
    @Result(property = "name", column = "name")
    @Result(property = "code", column = "code")
    @Select("SELECT * FROM departments WHERE id = #{id}")
    Department findById(long id);

}
