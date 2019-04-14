package com.ioc.dao.impl;

import com.ioc.annotation.MyDao;
import com.ioc.dao.LoginDao;

@MyDao
public class LoginDaoImpl implements LoginDao{
    @Override
    public String login() {
        return "项目成功启动";
    }
}
