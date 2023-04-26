package com.codeline.sbDemoBatch2.Services;

import com.codeline.sbDemoBatch2.Models.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    StudentRepository studentRepository;

    public List<School> getAllSchools() {

        return schoolRepository.getAllSchools();
    }
}
