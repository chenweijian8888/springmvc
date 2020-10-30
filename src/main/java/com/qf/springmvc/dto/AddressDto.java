package com.qf.springmvc.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AddressDto implements Serializable {
    private int id;
    private String city;
}
