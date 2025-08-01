package com.JournalApp.JournalApp.Service;

import com.JournalApp.JournalApp.Repository.UserRepository;
import com.JournalApp.JournalApp.model.User;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUserEntry(User user) {
        userRepository.save(user);
    }

    public List<User> getUserList(User user){
       return userRepository.findAll();
    }
    public User findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }


}
