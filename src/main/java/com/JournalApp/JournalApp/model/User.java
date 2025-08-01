package com.JournalApp.JournalApp.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "Users")
@Data
public class User {
    @Id
    private ObjectId id;
    @Indexed(unique = true)
    @NotBlank(message = "user name is required")
    private  String userName;
    @NotBlank(message = "password is required")
    private String password;
    @DBRef
    private Journal journal;
}
