package com.JournalApp.JournalApp.Controller;

import com.JournalApp.JournalApp.Service.JournalService;
import com.JournalApp.JournalApp.model.Journal;
import com.JournalApp.JournalApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/journal")
public class JournalController {
    @Autowired
    private JournalService journalService;
//    @GetMapping
//    public void createJournal(@RequestBody Journal journal){
//        journalService.addJournalEntry(journal);
//    }

}
