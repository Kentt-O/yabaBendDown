package org.example.data.repositories;

import org.example.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findUserByUsername(String username);
    User findUserByPassword(String password);
    User findUserByEmail(String email);
}
