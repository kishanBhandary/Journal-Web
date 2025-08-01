package com.JournalApp.JournalApp.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "JournalEntry")
@Data
public class Journal {
    @Id
    private ObjectId id;
    private String title;
    private String description;
    private Date date;
}
