package com.JournalApp.JournalApp.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JournalEntry")
@Data
@NoArgsConstructor
public class Journal {
    @Id
    private ObjectId id;
    @NonNull
    private String title;
    private String description;
}
