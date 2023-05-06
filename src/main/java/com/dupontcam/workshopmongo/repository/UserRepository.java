package com.dupontcam.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dupontcam.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
