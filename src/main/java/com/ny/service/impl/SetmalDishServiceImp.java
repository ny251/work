package com.ny.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ny.entity.SetmealDish;
import com.ny.mapper.SetmalDishMapper;
import com.ny.service.SetmalDishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmalDishServiceImp extends ServiceImpl<SetmalDishMapper,SetmealDish> implements SetmalDishService {
}
