package org.auction.data.repositories;

import org.auction.data.model.Auction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuctionRepository extends MongoRepository<Auction,String> {
    Auction findAuctionById(String id);
}
