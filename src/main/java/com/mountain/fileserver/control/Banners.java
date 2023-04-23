package com.mountain.fileserver.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller("")
@RequestMapping(value = "/banner")
public class Banners {

    @GetMapping()
    @ResponseBody
    public Object getBanner(){
        HashMap hashMap = new HashMap();
        hashMap.put("detail","查询成功");
        hashMap.put("enable",false);

        HashMap fileCodeBox = new HashMap();
        fileCodeBox.put("text","FileCodeBox");
        fileCodeBox.put("url","www.baidu.com");
        fileCodeBox.put("src","/static/banners/img_1.png");

        HashMap lanBlog = new HashMap();
        lanBlog.put("text","LanBlog");
        lanBlog.put("url","https://www.lanol.cn");
        lanBlog.put("src","/static/banners/img_2.png");

        List data = new ArrayList();
        data.add(fileCodeBox);
        data.add(lanBlog);

        hashMap.put("data",data);
        return hashMap;
    }

}
