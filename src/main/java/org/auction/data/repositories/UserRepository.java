package org.auction.data.repositories;

import org.auction.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findUserByUsername(String username);
    User findUserByPassword(String password);
    User findUserByEmail(String email);
}
