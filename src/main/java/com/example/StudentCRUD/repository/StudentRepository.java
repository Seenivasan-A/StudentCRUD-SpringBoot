package com.example.StudentCRUD.repository;

import com.example.StudentCRUD.entity.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository extends MongoRepository<StudentEntity, Integer> {
    StudentEntity findByName(String name);
}