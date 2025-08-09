package com.JournalApp.JournalApp.Service;

import com.JournalApp.JournalApp.Repository.UserRepository;
import com.JournalApp.JournalApp.model.User;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;
    private final PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
    public void saveUserEntry(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(List.of("Users"));
        userRepository.save(user);
    }

    public List<User> getUserList(User user){
       return userRepository.findAll();
    }
    public User findByUserName(String userName){

        return userRepository.findByUserName(userName);
    }
    public   User deleteByUserName(String userName){
        return userRepository.deleteByUserName(userName);
    }

}
