package com.JournalApp.JournalApp.Repository;

import com.JournalApp.JournalApp.model.Journal;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalRepository extends MongoRepository<Journal, ObjectId> {

}
