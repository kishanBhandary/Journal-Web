package com.JournalApp.JournalApp.Controller;
import com.JournalApp.JournalApp.Service.JournalService;
import com.JournalApp.JournalApp.Service.UserService;
import com.JournalApp.JournalApp.model.Journal;
import com.JournalApp.JournalApp.model.User;
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
    @Autowired
    private UserService userService;
    @PostMapping("/{userName}")
    public ResponseEntity<?> createEntry(@RequestBody Journal journal,@PathVariable String userName) {
        try {
            journalService.createUserJournals(journal, userName);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/{userName}")
    public ResponseEntity<?> getAllOfUsers(@PathVariable String userName){
        User user = userService.findByUserName(userName);
        List<Journal> journalList=user.getJournalList();
        if(journalList!=null&&!journalList.isEmpty()){
            return new ResponseEntity<>(journalList,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
