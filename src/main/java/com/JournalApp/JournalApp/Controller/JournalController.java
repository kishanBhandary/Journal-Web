package com.JournalApp.JournalApp.Controller;
import com.JournalApp.JournalApp.Service.JournalService;
import com.JournalApp.JournalApp.model.Journal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalController {
    @Autowired
    private JournalService journalService;
    @PostMapping
    public void createEntry(@RequestBody Journal journal){
        journalService.createJournal(journal);
    }
    @GetMapping
    public ResponseEntity<List<Journal>> getAll(Journal journal){
        return new ResponseEntity<>(journalService.getAll(journal), HttpStatus.OK);
    }

}
