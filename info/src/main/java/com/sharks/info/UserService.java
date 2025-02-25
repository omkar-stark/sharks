package com.sharks.info;

import java.util.List;

public interface UserService {

    List<User> getUser();

    User addUser(User user);
    
}
