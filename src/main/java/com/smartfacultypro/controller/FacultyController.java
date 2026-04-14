package com.smartfacultypro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.smartfacultypro.model.Faculty;
import com.smartfacultypro.service.FacultyService;

@RestController
@RequestMapping("/api/faculty")
@CrossOrigin(origins = "*")   // 🔥 (Postman / frontend connect easy)
public class FacultyController {

    @Autowired
    private FacultyService service;

    // GET all faculty
    @GetMapping
    public List<Faculty> getAll() {
        return service.getAllFaculty();
    }

    // POST add faculty
    @PostMapping
    public Faculty addFaculty(@RequestBody Faculty f) {
        return service.saveFaculty(f);
    }
}