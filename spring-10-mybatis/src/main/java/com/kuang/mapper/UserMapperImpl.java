package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;


import java.util.List;

public class UserMapperImpl implements UserMapper {
    //原来用sqlSession来执行sql，现在用sqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    //spring万物可注入，加一个set方法注入sqlSessin
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
