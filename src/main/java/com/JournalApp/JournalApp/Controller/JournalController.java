package com.JournalApp.JournalApp.Controller;

import com.JournalApp.JournalApp.Service.JournalService;
import com.JournalApp.JournalApp.model.Journal;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/journal")
public class JournalController {
    @Autowired
    private JournalService journalService;
    @GetMapping
    public ResponseEntity<Journal> allJournal(Journal journal){
        journalService.getAllJournal(journal);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PostMapping
    public void createJournal(@RequestBody Journal journal){
        journalService.saveJournal(journal);
    }

}
