package com.sharks.info;

import java.util.ArrayList;
import java.util.List;

public class UserImplementation implements UserService{

    List<User> userList = new ArrayList<>();

    @Override
    public List<User> getUser(){
        return userList;
    }

    @Override
    public User addUser(User user){
        userList.add(user);
                return user;
        

    }
    
}
