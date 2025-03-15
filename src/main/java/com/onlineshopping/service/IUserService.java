package com.onlineshopping.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.onlineshopping.dto.LoginFormDTO;
import com.onlineshopping.dto.Result;
import com.onlineshopping.entity.User;

import javax.servlet.http.HttpSession;

public interface IUserService extends IService<User> {
    Result login(LoginFormDTO loginForm, HttpSession session);
}
