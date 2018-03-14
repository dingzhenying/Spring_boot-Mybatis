package com.inspur.spring_boot_mybatis.Service;

import com.inspur.spring_boot_mybatis.bean.Demo;
import com.inspur.spring_boot_mybatis.dao.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;

@Service
public class DemoService {
    @Autowired
    private DemoMapper demoMapper;


    public List<Demo> likeName(String name){
        return demoMapper.likeName(name);
    }
    @Transient//添加事物
    public void save (Demo demo ){
         demoMapper.save(demo);

    }
}
