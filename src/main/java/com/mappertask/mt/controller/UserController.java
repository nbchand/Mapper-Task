package com.mappertask.mt.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mappertask.mt.model.Employee.Address;
import com.mappertask.mt.model.User.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import org.springframework.web.bind.annotation.*;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-06-10
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final ModelMapper modelMapper;

    @PostMapping
    public Address getUserAndThrowAddress(@ModelAttribute User user, @RequestParam String addressJson) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(addressJson, Address.class);
    }
}
