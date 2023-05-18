package com.mountain.fileserver.control;

import com.alibaba.fastjson.JSONObject;
import com.mountain.fileserver.responsePojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

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

    @PostMapping(value = "/getFile")
    @ResponseBody
    public Result getFile(@RequestBody(required = true) JSONObject code) {//返回json 数据
        System.out.println(code);
        Object returnCode = code.get("code");

        Result result = new Result();
        result.setCode(500);
        result.setMsg("取件码错误");
        result.setData("测试");

        return result;
    }

}
