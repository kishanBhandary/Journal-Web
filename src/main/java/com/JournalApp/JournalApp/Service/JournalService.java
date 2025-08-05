package com.JournalApp.JournalApp.Service;

import com.JournalApp.JournalApp.Repository.JournalRepository;
import com.JournalApp.JournalApp.model.Journal;
import com.JournalApp.JournalApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class JournalService {
    @Autowired
   private JournalRepository journalRepository;

   @Autowired
   private UserService userService;
   @Transactional
   public void createUserJournals(Journal journal,String userName){
       User user = userService.findByUserName(userName);
       Journal saved = journalRepository.save(journal);
       user.getJournalList().add(saved);
       userService.saveUserEntry(user);
   }
    public List<Journal> getAllJournals(){
        return journalRepository.findAll();

    }

}
