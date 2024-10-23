package com.journal.journal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.journal.journal.entity.JournalEntry;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {

}
