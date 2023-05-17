package com.mountain.fileserver.control;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mountain.fileserver.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.context.IWebContext;
import org.thymeleaf.context.WebContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @PostMapping(value = "")
    @ResponseBody
    public Object login(@RequestBody(required = true) User user){


        return null;
    }

}
