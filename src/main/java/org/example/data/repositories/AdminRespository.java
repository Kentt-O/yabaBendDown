package org.example.data.repositories;

import org.example.data.model.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface AdminRespository extends MongoRepository<Admin, String>{
}
