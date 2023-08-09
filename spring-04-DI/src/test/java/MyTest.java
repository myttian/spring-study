import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
//    Student(
//    name=斯达康,
//    address=com.kuang.pojo.Address@4f970963,
//    books=[红楼梦, 西游记, 水浒传, 三国演义],
//    hobbys=[听歌, 敲代码, 看电影],
//    card={身份证=111111111111111111, 银行卡=22222222222222222222},
//    games=[LOL, COC, BOB],
//    wife=null,
//    info={password=admin, url=localhost://3306, driver=com.mysql.jdbc.Driver, username=root}
//    )