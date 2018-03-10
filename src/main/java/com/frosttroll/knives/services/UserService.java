package com.frosttroll.knives.services;

import com.frosttroll.knives.entity.User;
import com.frosttroll.knives.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public Collection<User> getUsers() {
        return this.userDao.getUsers();
    }

    public User getUserById(Integer id) {
        return this.userDao.getUserById(id);
    }

    public User login(String email, String password ) {

        Collection<User> users = this.userDao.getUsers();

        Optional<User> maybeUser = users.stream().filter(user -> user.getEmail().equals(email) && user.getPasswd().equals(password)).findFirst();

        if(maybeUser.isPresent()) {
            return maybeUser.get();
        }
        return null;
    }
}
