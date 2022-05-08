package com.ny.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ny.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
