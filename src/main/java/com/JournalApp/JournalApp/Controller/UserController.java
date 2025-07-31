package com.JournalApp.JournalApp.Controller;

import com.JournalApp.JournalApp.Service.UserService;
import com.JournalApp.JournalApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
   public List<User> getUser(User user){
       return userService.getUserList(user);
   }

    @PostMapping
   public void createUser(@RequestBody User user){
        userService.saveUserEntry(user);
    }

}
