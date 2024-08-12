package org.auction.data.repositories;

import org.auction.data.model.BidEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BidEventRepository extends MongoRepository<BidEvent, String> {
}
