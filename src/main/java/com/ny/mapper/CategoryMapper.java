package com.ny.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ny.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.Locale;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
