import com.kuang.pojo.PeopleAnno;
import com.kuang.pojo.People_xml;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansanno.xml");
        PeopleAnno peopleAnno = context.getBean("peopleAnno", PeopleAnno.class);
        System.out.println(peopleAnno.toString());
        peopleAnno.getCat().shout();
        peopleAnno.getDog().shout();
    }

    @Test
    public void testxml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansxml.xml");
        People_xml people_xml = context.getBean("people_xml", People_xml.class);
        System.out.println(people_xml.toString());
        people_xml.getDog().shout();
    }
}
