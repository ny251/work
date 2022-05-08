package com.ny.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ny.entity.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);

}
