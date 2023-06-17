package com.studentservice.repository;

import com.studentservice.modal.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentServiceRepository extends JpaRepository<StudentEntity , Long> {

}

