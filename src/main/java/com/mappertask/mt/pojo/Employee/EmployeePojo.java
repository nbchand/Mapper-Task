package com.mappertask.mt.pojo.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-06-10
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePojo {
    private Integer id;
    private String name;
    private AddressPojo address;
}
