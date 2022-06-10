package com.mappertask.mt.model.User;

import com.mappertask.mt.model.Employee.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-06-10
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String email;
    private String password;
    private Address address;
    private MultipartFile image;
}
