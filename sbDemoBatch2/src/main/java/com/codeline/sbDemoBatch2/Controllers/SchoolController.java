package com.codeline.sbDemoBatch2.Controllers;


import com.codeline.sbDemoBatch2.Models.School;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "school")
public class SchoolController {

    @RequestMapping(value = "getAll")
    public List<School> getAllSchool(){
        schools = schoolService.getAllSchools();
        slackClient.sendMessage(schoolService.formatSchoolListForSlack(schools).toString());
        return schools;
    }

    }
}
