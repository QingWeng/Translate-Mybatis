package com.aqya.dao;

import com.aqya.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author 阿青呀
 * @auther wenqing
 * @creat 2022-03-11 23:24
 */
public interface UserMapper {

     /**
      * 分页
      * @param map
      * @return
      */
     List<User> translate(Map<String,Integer> map);
    
}
