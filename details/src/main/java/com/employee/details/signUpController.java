package com.employee.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/signup")
public class signUpController {

    @Autowired
    private signUpService signUpService;

    @GetMapping("signup")
    public String signupPage() {
        return "signup";
    }

    @PostMapping
    public signUp registerUser(@RequestBody signUp signUp) {
        return signUpService.registerUser(signUp);
    }

    

    // Additional endpoints
    // @GetMapping("/{id}")
    // public SignUp getUser(@PathVariable Long id) { ... }

    // etc.
}