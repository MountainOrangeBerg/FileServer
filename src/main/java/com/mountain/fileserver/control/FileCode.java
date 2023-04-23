package com.mountain.fileserver.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class FileCode {

    @PostMapping(value = "/")
    @ResponseBody
    public HashMap say(@RequestParam(required = true)  String code) {//返回json 数据
        System.out.println("11111");
        HashMap hashMap = new HashMap();
        hashMap.put("detail","取件码错误，0次后将被禁止5分钟");
        return hashMap;
    }

}
