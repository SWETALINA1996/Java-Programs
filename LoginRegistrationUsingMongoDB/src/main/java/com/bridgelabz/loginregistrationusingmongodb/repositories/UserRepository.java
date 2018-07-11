package com.bridgelabz.loginregistrationusingmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.loginregistrationusingmongodb.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>
{

}
