package org.example.data.repositories;

import org.example.data.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer,String> {
}
