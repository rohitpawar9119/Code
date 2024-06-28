package com.demo.model.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.model.Student;

public interface StudentRepository extends MongoRepository<Student,Integer>{

}
