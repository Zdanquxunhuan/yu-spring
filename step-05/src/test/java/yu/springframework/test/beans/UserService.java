package yu.springframework.test.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhongcanyu
 * @date 2023/11/6
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserService {

    private String uId;

    private UserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(uId);
    }
}
