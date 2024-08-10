package org.example.data.repositories;

import org.example.data.model.ObjectInAuction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ObjectInAuctionRepository extends MongoRepository<ObjectInAuction,String> {
}
