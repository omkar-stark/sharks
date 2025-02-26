package com.employee.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class signUpService {

    @Autowired
    private signUpRepository userRepository;

    @Transactional
    public signUp registerUser(signUp user) {
        // if (userRepository.existsByEmail(user.getEmailId())) {
        //     return "Email already in use!";
        // }
        userRepository.save(user);
        return user;
    }

    // public signUp getUserById(Long id) {
    //     return signUpRepository.findById(id)
    //             .orElseThrow(() -> new RuntimeException("User not found with id " + id));
    // }

    // Add additional service methods as needed:
    // - updateUser()
    // - deleteUser()
    // - findAllUsers()
    // etc.
}