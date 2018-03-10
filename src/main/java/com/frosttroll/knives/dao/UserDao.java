package com.frosttroll.knives.dao;

import com.frosttroll.knives.entity.User;
import com.frosttroll.knives.enums.UserFlags;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao {

    private static Map<Integer, User> users;


    static {
        users = new HashMap<Integer, User>() {
            {
                put(1, new User(1, "Henrik", "hcollin78@gmail.com", "testi", null));
            }
        };
    }

    public Collection<User> getUsers() {
        return this.users.values();
    }

    public User getUserById(Integer id) {
        return this.users.get(id);
    }


}
