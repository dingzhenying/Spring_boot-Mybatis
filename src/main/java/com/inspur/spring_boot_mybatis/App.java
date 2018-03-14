package com.inspur.spring_boot_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.inspur.*")//扫描相应包下面的CLASS 主要是MYBATIS的持久化类
public class App {
    public static void main(String[] args){
    SpringApplication.run(App.class,args);
    System.out.println("启动完成");

    }
}
