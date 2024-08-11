package org.auction.data.repositories;

import org.auction.data.model.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface AdminRespository extends MongoRepository<Admin, String>{
}
