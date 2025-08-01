package com.JournalApp.JournalApp.Service;

import com.JournalApp.JournalApp.Repository.JournalRepository;
import com.JournalApp.JournalApp.model.Journal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JournalService {
    @Autowired
    private JournalRepository journalRepository;
    public void addJournalEntry(Journal journal){
        journalRepository.save(journal);
    }

}
