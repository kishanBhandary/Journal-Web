package com.JournalApp.JournalApp.model;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JournalEntry")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Journal {
    @Id
    private ObjectId id;
    @NotBlank(message = "Should not be empty")
    private String title;
    private String description;
}
