package com.mappertask.mt.pojo.User;

import com.mappertask.mt.pojo.Employee.AddressPojo;
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
public class UserPojo {
    private Integer id;
    private String email;
    private String password;
    private AddressPojo address;
    private MultipartFile image;
}
