package com.query.example.demo.controller;

import com.query.example.demo.reponse.AddressReponseDTO;
import com.query.example.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/address/{employeeId}")
    public ResponseEntity<AddressReponseDTO> getAddressByEmployeeId(@PathVariable("employeeId") int employeeId) {

        try {
            AddressReponseDTO addressReponse = addressService.findAddressByEmployeeId(employeeId);
            return ResponseEntity.status(HttpStatus.OK).body(addressReponse);
        }catch (Exception e)
        {
            e.getMessage();
        }
        return null;
    }
}
