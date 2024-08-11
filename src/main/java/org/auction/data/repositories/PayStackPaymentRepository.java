package org.auction.data.repositories;

import org.auction.data.model.PayStackPayment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PayStackPaymentRepository extends MongoRepository<PayStackPayment, String> {
}
