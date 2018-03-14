package com.inspur.spring_boot_mybatis.dao;

import com.inspur.spring_boot_mybatis.bean.Demo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DemoMapper {

        @Select("select * from demo where name=#{name}")
        public List<Demo> likeName(String name);
        @Select("select * from demo where id=#{id}")
        public Demo getById(int id);
        @Select("select name from demo where id=#{id}")
        public String getNameById(int id);

        /*
        *
        * 保存数据
        * */
        @Insert("insert into demo (name) values(#{name}) ")
        @Options(useGeneratedKeys=true,keyColumn = "id",keyProperty = "id")
        public void save (Demo demo);

}
