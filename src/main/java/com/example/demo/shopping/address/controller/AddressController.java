package com.example.demo.shopping.address.controller;

import com.example.demo.shopping.address.entiy.Address;
import com.example.demo.shopping.address.mapper.AddressMapper;
import com.example.demo.shopping.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/address")

public class AddressController {
    @Autowired
    private AddressMapper addressMapper;
    @Autowired
    private AddressService addressService;
    @PostMapping("/select")
    public ArrayList<Address> selectAddress(@RequestBody Address address){
        ArrayList<Address> addresses=addressService.selectAddress(address);
        return addresses;
    }
}