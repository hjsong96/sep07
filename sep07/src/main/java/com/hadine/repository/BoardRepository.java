package com.hadine.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hadine.entity.Board;

public interface BoardRepository extends MongoRepository<Board, Object> {

}
