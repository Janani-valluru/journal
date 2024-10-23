package com.journal.journal.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.journal.journal.entity.JounalEntry;

//import com.journal.journal.entity.JounalEntry;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {



    @GetMapping
    public List<JounalEntry> getAll() {
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JounalEntry myEntry) { // SPRING TAKE THE DATA FROM THE REQUEST AND TURN IT
        // INTO JAVA OBJECT THAT I CAN USE IN MY CODE
        // LIKE it takes data from postman whatever the data is there it shd pass here
        // and it return boolean value

        return true;
    }

    /**
     * Retrieve a journal entry by its id
     *
     * @param id the id of the journal entry
     * @return the journal entry with the given id
     */
    @GetMapping("id/{myId}")
    public JounalEntry getEntry(@PathVariable long myId) {

        return null;
    }

    @DeleteMapping("id/{myId}")
    public JounalEntry deletJounalEntryById(@PathVariable long myId) {

        return null;
    }

    @PutMapping
    public JounalEntry updateJounalEntry(@PathVariable Long id, @RequestBody JounalEntry myEntry) {
        return null;
    }
}
