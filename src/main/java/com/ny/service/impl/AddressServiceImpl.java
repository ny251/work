package com.ny.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ny.entity.AddressBook;
import com.ny.mapper.AddressBookMapper;
import com.ny.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl extends ServiceImpl<AddressBookMapper,AddressBook> implements AddressService {
}
