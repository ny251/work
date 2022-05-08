package com.ny.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ny.common.R;
import com.ny.entity.Employee;
import com.ny.entity.User;
import com.ny.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @Transactional
    //@RequestBody Map map, HttpSession session
    public R<User> login(HttpSession session, @RequestBody User user){
        String phone = user.getPhone();
        String code = "1234";
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getPhone,phone);
        User user1 = userService.getOne(queryWrapper);


        if (user1 == null) {
            User user2 = new User();
            user2.setPhone(phone);
            user2.setStatus(1);
            user2.setAvatar(code);
            userService.save(user2);
            session.setAttribute("user",user2.getId());
            return R.success(user2);
        }
        if (user1.getAvatar().toString().equals(code)) {
            session.setAttribute("user",user1.getId());
            return R.success(user1);
        }
        return R.error("登录失败");
      //  request.getSession().setAttribute("employee", emp.getId());
       // request.getSession().setAttribute("user",user1.getId());
       // return R.success(user1);
    }
}
