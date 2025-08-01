package com.JournalApp.JournalApp.Service;

import com.JournalApp.JournalApp.Repository.JournalRepository;
import com.JournalApp.JournalApp.model.Journal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JournalService {
    @Autowired
    private JournalRepository journalRepository;

    public List<Journal> getAllJournal(Journal journal){
        return journalRepository.findAll();
    }

    public void saveJournal(Journal journal){
        journalRepository.save(journal);
    }
}
