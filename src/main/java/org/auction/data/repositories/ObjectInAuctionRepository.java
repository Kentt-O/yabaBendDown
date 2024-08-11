package org.auction.data.repositories;

import org.auction.data.model.ObjectInAuction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ObjectInAuctionRepository extends MongoRepository<ObjectInAuction,String> {
}
