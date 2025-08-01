package com.JournalApp.JournalApp.Controller;

import com.JournalApp.JournalApp.Service.JournalService;
import com.JournalApp.JournalApp.model.Journal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/journal")
public class JournalController {
    @Autowired
    protected JournalService journalService;
    @GetMapping
    public ResponseEntity<Journal> allJournal(@RequestBody Journal journal){
        journalService.getAllJournal(journal);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
