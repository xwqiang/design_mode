import com.kuyun.model.User;
import com.kuyun.service.UserProvider;
import com.kuyun.specification.AndSpec;
import com.kuyun.specification.GThanSpec;
import com.kuyun.specification.ISpec;
import com.kuyun.specification.LikeSpec;
import com.kuyun.specification.OrSpec;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuwuqiang on 2017/11/7.
 */
public class Client {

    public static void main(String[] args) {
        List<User> users = new ArrayList();
        users.add(new User(12, "bob"));
        users.add(new User(22, "abob"));
        users.add(new User(28, "cbob"));
        users.add(new User(23, "youshen"));
        ISpec like = new LikeSpec("bob");
        ISpec age = new GThanSpec(20);
        ISpec and = new OrSpec(like, age);
        ISpec all = new AndSpec(and, new GThanSpec(22));
        UserProvider userProvider = new UserProvider(users);
        List<User> list = userProvider.search(all);
        for (User user : list) {
            System.out.println(user);
        }

    }
}
