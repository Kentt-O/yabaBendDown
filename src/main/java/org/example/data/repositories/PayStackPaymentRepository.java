package org.example.data.repositories;

import org.example.data.model.PayStackPayment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PayStackPaymentRepository extends MongoRepository<PayStackPayment, String> {
}
