package com.ny.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ny.entity.ShoppingCart;
import com.ny.mapper.ShoppingCartMapper;
import com.ny.service.ShoppingCartService;
import com.ny.mapper.ShoppingCartMapper;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
