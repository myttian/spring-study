import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class mybatisTest {
    @Test
    public void selectUser() throws IOException {
        //        String resource = "mybatis-config.xml";
        //        InputStream inputStream = Resources.getResourceAsStream(resource);
        //        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //
        //        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //        List<User> userList = mapper.selectUser();
        //        for (User user: userList){
        //            System.out.println(user);
        //        }
        //
        //        sqlSession.close();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper mapper = context.getBean("userMapper",UserMapper.class);
        List<User> user = mapper.selectUser();
        System.out.println(user);
    }
}
