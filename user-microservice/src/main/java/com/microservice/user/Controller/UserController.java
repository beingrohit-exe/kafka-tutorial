package com.microservice.user.Controller;

import org.springframework.web.bind.annotation.*;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Microservice
 * Package - com.microservice.user.Controller
 * Created_on - 26 March-2024
 * Created_at - 22 : 53
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/userData")
    public UserData userResponse() {
        return new UserData("Rohit Parihar", "rohitparih@gmail.com");
    }

    @PostMapping("/userData")
    public UserData postUserData(@RequestBody UserData userData) {
        return userData;
    }

    public static class UserData {
        private String name;
        private String email;

        public UserData(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
