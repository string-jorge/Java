package com.jorge.test;

import com.jorge.dao.UserDao;
import com.jorge.domain.User;
import org.junit.Test;

public class UserDaoTest {

    @Test
    public void testLogin() {
        User loginUser = new User();
        loginUser.setUsername("jorge");
        loginUser.setPassword("19990628");

        UserDao dao = new UserDao();
        User user = dao.login(loginUser);

        System.out.println(user);
    }

}
