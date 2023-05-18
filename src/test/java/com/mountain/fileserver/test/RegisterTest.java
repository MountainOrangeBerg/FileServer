package com.mountain.fileserver.test;

import com.mountain.fileserver.FileServerApplication;
import com.mountain.fileserver.control.RegisterController;
import com.mountain.fileserver.dao.UserMapper;
import com.mountain.fileserver.pojo.User;
import com.mountain.fileserver.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class RegisterTest {

    @Autowired
    private UserService userService;

    @Autowired
    private RegisterController registerController;

    @Test
    public void register(){
        User user = new User();
        user.setId("vaercaede");
        user.setUsername("aisjcfe2nfno3i4");
        user.setGender(0);
        user.setPassword("123123");
//        userService.register(user);
        registerController.register(user);
    }

}
