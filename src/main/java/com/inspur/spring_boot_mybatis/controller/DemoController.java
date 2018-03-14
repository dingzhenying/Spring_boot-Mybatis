package com.inspur.spring_boot_mybatis.controller;


import com.github.pagehelper.PageHelper;
import com.inspur.spring_boot_mybatis.Service.DemoService;
import com.inspur.spring_boot_mybatis.bean.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;
    @RequestMapping("/likeName")
    public List<Demo> likeName(String name){
		/*
		 * 第一个参数：第几页;
		 * 第二个参数：每页获取的条数.
		 */
        PageHelper.startPage(1, 2);
        return demoService.likeName(name);
    }
    @RequestMapping("/insert")
    public Demo save (){
        Demo demo=new Demo();
        demo.setName("张三");
        demoService.save(demo);
        return demo;

    }


}
