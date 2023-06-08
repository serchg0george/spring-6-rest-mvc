package com.springframework.spring6restmvc.mappers;


import com.springframework.spring6restmvc.entities.Customer;
import com.springframework.spring6restmvc.models.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);

}
