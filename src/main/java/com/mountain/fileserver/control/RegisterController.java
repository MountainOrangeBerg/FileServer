package com.mountain.fileserver.control;

import com.mountain.fileserver.pojo.User;
import com.mountain.fileserver.responsePojo.Result;
import com.mountain.fileserver.responsePojo.ResultCode;
import com.mountain.fileserver.service.UserService;
import com.mountain.fileserver.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/createUser")
    @ResponseBody
    public Result register(@RequestBody(required = true) User user){
        IdWorker worker = new IdWorker(1,1,1);
        user.setId(String.valueOf(worker.nextId()));
        userService.register(user);
        return new Result(ResultCode.SUCCESS,"成功");
    }

    @GetMapping(value = "/active")
    @ResponseBody
    public Result active(@RequestBody(required = true) User user){
        userService.activateAccount(user);
        return new Result();
    }

}
