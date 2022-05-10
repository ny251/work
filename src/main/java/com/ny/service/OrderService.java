package com.ny.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ny.entity.Orders;

public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
