package com.query.example.demo.service;

import com.query.example.demo.entity.Address;
import com.query.example.demo.reponse.AddressReponseDTO;
import com.query.example.demo.repository.AddressRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepo addressRepo;


    @Autowired
    private ModelMapper mapper;


    public AddressReponseDTO findAddressByEmployeeId(int employeeId) {
        Optional<Address> addressByEmployeeId = addressRepo.findAddressByEmployeeId(employeeId);
        AddressReponseDTO addressReponse = mapper.map(addressByEmployeeId, AddressReponseDTO.class);
        return addressReponse;
    }


}
