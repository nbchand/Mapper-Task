package com.mappertask.mt.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mappertask.mt.model.Employee.Employee;
import com.mappertask.mt.pojo.Employee.EmployeePojo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
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
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final ModelMapper modelMapper;

//    @PostMapping
//    public Employee getPojoDisplayEntity(@RequestBody EmployeePojo employeePojo) throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//        return mapper.readValue(
//                mapper.writeValueAsString(employeePojo), Employee.class
//        );
//    }

    @PostMapping
    public Employee getPojoDisplayEntity(@RequestBody EmployeePojo employeePojo) {
        return modelMapper.map(employeePojo, Employee.class);
    }
}
