package com.smartfacultypro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartfacultypro.model.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
}