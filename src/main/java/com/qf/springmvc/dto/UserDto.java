package com.qf.springmvc.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private int id;
    private String username;
    private AddressDto address;
    private List<String> list;
}
