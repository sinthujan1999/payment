package com.piston.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.piston.model.PaymentRequest;


@Repository
public interface cardRepository extends MongoRepository<PaymentRequest,String>{
}
