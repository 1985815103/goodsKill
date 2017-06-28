package org.seckill.service.impl;

import org.junit.Test;
import org.seckill.entity.User;
import org.seckill.service.UserAccountService;
import org.seckill.service.base.BaseServiceConfigForTest;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by heng on 2017/6/28.
 */
public class UserAccountServiceImplTest extends BaseServiceConfigForTest{
    @Autowired
    private UserAccountService userAccountService;
    @Test
    public void register() throws Exception {
        User user=new User();
        user.setAccount("tee");
        user.setPassword("123");
        userAccountService.register(user);
    }

    @Test
    public void login() throws Exception {
        User user=new User();
        user.setAccount("tee");
        user.setPassword("123");
        userAccountService.register(user);
        userAccountService.login(user);
    }

    @Test
    public void sendMsgForLogin() throws Exception {
//        userAccountService.sendMsgForLogin();
    }

    @Test
    public void onMessage() throws Exception {
    }

}