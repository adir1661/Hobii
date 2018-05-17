package com.hobii.model.datasource;

import com.hobii.model.entitiy.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adir on 5/16/2018.
 */

public class UserList {
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User user){
        users.add(user);
    }
    public boolean removeUser(User user){
        if (users.contains(user))
        {
            users.remove(user);
            return true;
        }
        return false;
    }
    List<User> users;
    public UserList() {
        users= new ArrayList<>();
        users.add(new User("adir",3222));
        users.add(new User("sarel",3115));
        users.add(new User("binyamin",1932));
        users.add(new User("yehuda",1590));
        users.add(new User("eran",1201));
        users.add(new User("orel",589));
        users.add(new User("david",34));
    }
}
