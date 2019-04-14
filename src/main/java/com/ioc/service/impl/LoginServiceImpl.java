package com.ioc.service.impl;

import com.ioc.annotation.MyAutowired;
import com.ioc.annotation.MyService;
import com.ioc.dao.LoginDao;
import com.ioc.service.LoginService;
@MyService(value = "test")
public class LoginServiceImpl implements LoginService {
    @MyAutowired
    private LoginDao loginDao;

    @Override
    public String login() {
        return loginDao.login();
    }
}
