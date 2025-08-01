package com.JournalApp.JournalApp.Service;

import com.JournalApp.JournalApp.Repository.JournalRepository;
import com.JournalApp.JournalApp.model.Journal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JournalService {
    @Autowired
   protected JournalRepository journalRepository;

    public void getAllJournal(Journal journal){
        journalRepository.findAll();
    }

    public void saveJournal(Journal journal){
        journalRepository.save(journal);
    }
}
