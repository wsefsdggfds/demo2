package com.example.demo.shopping.address.service;

import com.example.demo.shopping.address.entiy.Address;
import com.example.demo.shopping.address.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class AddressService {
    @Autowired
    private AddressMapper addressMapper;
    public ArrayList<Address> selectAddress(Address address){
        ArrayList<Address> addresses=new ArrayList<>();
        return addressMapper.selectAddress();

    }
}
