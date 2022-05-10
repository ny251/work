package com.ny.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ny.entity.dto.DishDto;
import com.ny.entity.Dish;

public interface DishService extends IService<Dish> {
    public void saveWithFlavor(DishDto dishDto);

    public DishDto getByIdWithFlavor(Long id);

    public void updateWithFlavor(DishDto dishDto);
}
