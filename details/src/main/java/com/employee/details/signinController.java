package com.employee.details;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/signin")

public class signinController {

    @Autowired
    private signUpRepository signUpRepository;

    @PostMapping
    public ResponseEntity<String> login(@RequestBody signUp loginRequest) {

        // 1) Find user in DB by email
        System.out.println(loginRequest.getEmailId());
        Optional<signUp> foundUser = signUpRepository.findByEmailId(loginRequest.getEmailId());


        if (foundUser.isEmpty()) {
            // If no user found, respond 404 or 401 (depending on your preference)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }

        // 2) Check password
        signUp user = foundUser.get();
        if (!user.getPassword().equals(loginRequest.getPassword())) {
            // If password doesn't match, respond 401
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid password");
        }

        // 3) If everything matches, respond 200 OK
        return ResponseEntity.ok("Login successful");
    }

}
