package com.hadine.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hadine.entity.Test;

public interface TestRepository extends MongoRepository<Test, Long>{

}
