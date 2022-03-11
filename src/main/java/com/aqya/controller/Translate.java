package com.aqya.controller;

import com.aqya.dao.UserMapper;
import com.aqya.pojo.User;
import com.aqya.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;

/**
 * @author 阿青呀
 * @auther wenqing
 * @creat 2022-03-11 23:39
 */
public class Translate {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession ();

        UserMapper mapper = sqlSession.getMapper (UserMapper.class);

        HashMap<String, Integer> map = new HashMap<String,Integer>();
        map.put ("startIndex",0);
        map.put ("pageSize",4);

        List<User> users = mapper.translate (map);
        for (User user : users) {
            System.out.println (user);
        }

        sqlSession.close ();

    }
}
