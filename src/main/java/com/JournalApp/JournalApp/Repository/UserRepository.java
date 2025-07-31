package com.JournalApp.JournalApp.Repository;

import com.JournalApp.JournalApp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Object> {
    User findByUserName(String userName);
}
