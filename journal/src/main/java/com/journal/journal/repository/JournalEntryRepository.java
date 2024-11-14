package com.journal.journal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.journal.journal.entity.JournalEntry;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> { // string becuase journal entry ID is string

}
