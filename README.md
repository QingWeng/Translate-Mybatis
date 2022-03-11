使用mybatis实现简单的分页


创建数据库
创建一个maven项目
配置pom.xml需要用到的依赖有mybatis、mysql（数据库）、junit(测试)
配置mybatis-config.xml 和db.xml(数据库)


创建utils工具包  创建MybatisUtils工具类  获得到sqlSession
创建pojo层  User类 
创建dao层  USerMapper接口  UserMapper.xml
创建controller层  使用main函数  先得到sqlSession   getMapper
在创建一个 map   HashMap<String, Integer> ()   
然后用map.put方法将startIndex、pageSize分别传入
实现分页
打印user


数据库
```sql

create table user
(
    id   int         not null
        primary key,
    name varchar(20) null,
    pwd  varchar(20) null
);

-- 通过limit startIndex(起始位置)  pageSize(页面显示数据条数)
    <select id="translate" resultMap="userMap">
        select id,name,pwd from mybatis.user limit  #{startIndex} , #{pageSize};
    </select>

```


