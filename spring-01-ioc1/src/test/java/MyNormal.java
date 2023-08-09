import com.kuang.Dao.UserDaoImpl;
import com.kuang.Dao.UserDaoMysqlImpl;
import com.kuang.service.Normal;

public class MyNormal {
    public static void main(String[] args) {
        Normal normal = new Normal();
        normal.setUserDao(new UserDaoMysqlImpl());
        normal.getUser();
    }
}
