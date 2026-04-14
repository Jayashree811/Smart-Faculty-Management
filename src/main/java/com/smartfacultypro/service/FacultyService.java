package com.smartfacultypro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.smartfacultypro.model.Faculty;
import com.smartfacultypro.repository.FacultyRepository;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository repo;

    public List<Faculty> getAllFaculty() {
        return repo.findAll();
    }

    public Faculty saveFaculty(Faculty f) {
        return repo.save(f);
    }
}