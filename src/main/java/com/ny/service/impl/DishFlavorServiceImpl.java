package com.ny.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ny.entity.DishFlavor;
import com.ny.mapper.DisFlavorMapper;
import com.ny.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DisFlavorMapper, DishFlavor> implements DishFlavorService {
}
