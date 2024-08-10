package org.example.data.repositories;

import org.example.data.model.Bid;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BidRepository extends MongoRepository<Bid, String> {
}
