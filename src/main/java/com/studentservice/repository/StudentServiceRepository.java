package com.studentservice.repository;

import com.studentservice.modal.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentServiceRepository extends JpaRepository<StudentEntity , Long> {

}

