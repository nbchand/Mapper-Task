package com.mappertask.mt.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mappertask.mt.model.Student.Student;
import com.mappertask.mt.pojo.Student.StudentPojo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-06-10
 */
@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final ObjectMapper mapper = new ObjectMapper();

    @PostMapping
    public Student mapPojoToModel(@RequestBody StudentPojo studentPojo) throws JsonProcessingException {
        return mapper.readValue(
                mapper.writeValueAsString(studentPojo),
                Student.class
        );
    }
}
