package com.ny.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ny.entity.dto.SetmealDto;
import com.ny.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    public void saveWithDish(SetmealDto setmealDto);
    public void removeWithDish(List<Long> ids);
}
