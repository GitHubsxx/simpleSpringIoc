package com.ioc.controller;

import com.ioc.annotation.MyAutowired;
import com.ioc.annotation.MyController;
import com.ioc.annotation.MyValue;
import com.ioc.service.LoginService;
@MyController
public class LoginController {
    @MyValue(value = "ioc.scan.pathTest")
    private String test;

    @MyAutowired(value = "test")
    private LoginService loginService;

    public String login() {
        return loginService.login();
    }

}
