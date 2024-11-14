package com.journal.journal.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.journal.journal.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.journal.journal.entity.JournalEntry;

//import com.journal.journal.entity.JounalEntry;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;



    @GetMapping
    public List<JournalEntry> getAll() {
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) { // SPRING TAKE THE DATA FROM THE REQUEST AND TURN IT
    journalEntryService.saveEntry(myEntry);
        return true;
    }


    @GetMapping("id/{myId}")
    public JournalEntry getEntry(@PathVariable long myId) {

        return null;
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deletJounalEntryById(@PathVariable long myId) {

        return null;
    }

    @PutMapping
    public JournalEntry updateJounalEntry(@PathVariable Long id, @RequestBody JournalEntry myEntry) {
        return null;
    }
}
