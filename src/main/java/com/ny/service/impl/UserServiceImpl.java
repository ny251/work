package com.ny.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ny.entity.User;
import com.ny.mapper.UserMapper;
import com.ny.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
}
