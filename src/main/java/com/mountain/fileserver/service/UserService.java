package com.mountain.fileserver.service;

import com.mountain.fileserver.pojo.User;
import org.springframework.stereotype.Service;


public interface UserService {

    User findUserById(User user);
    void register(User user);
    void deleteUserById(User user);

    void activateAccount(User user);



}
