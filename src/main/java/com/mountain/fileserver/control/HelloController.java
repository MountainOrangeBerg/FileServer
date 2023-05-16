package com.mountain.fileserver.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.context.IWebContext;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@Controller
@RequestMapping(value = "/")
public class HelloController {

    @Autowired
    ThymeleafViewResolver thymeleafViewResolver;

    @GetMapping(value = "")
    @ResponseBody
    public Object say1(HttpServletRequest request,
                       HttpServletResponse response, Model model, @RequestParam(required = false) String code) {
        if (code==null) {
            IWebContext ctx = new WebContext(request,response,
                    request.getServletContext(),request.getLocale(), model.asMap());
            return thymeleafViewResolver.getTemplateEngine().process("DownloadPage", ctx);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("detail", "取件码错误，0次后将被禁止5分钟");
            return hashMap;
        }
    }

    @GetMapping(value = "/test")
    @ResponseBody
    public Object say2(HttpServletRequest request,
                       HttpServletResponse response, Model model, @RequestParam(required = false) String code) {
        if (code==null) {
            IWebContext ctx = new WebContext(request,response,
                    request.getServletContext(),request.getLocale(), model.asMap());
            return thymeleafViewResolver.getTemplateEngine().process("test", ctx);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("detail", "取件码错误，0次后将被禁止5分钟");
            return hashMap;
        }
    }
}