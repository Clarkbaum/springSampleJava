package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService") //name not required// this allows me to comment out all of the beans in appconfig
@Scope("prototype") //defaults to singleton if empty(one instance of object)
public class CustomerServiceImpl implements CustomerService {

    //@Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(){}

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("we are using constructor injection");
        this.customerRepository = customerRepository;
    }

    @Autowired //would put this here instead of above customerRepository if using setter injection
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("we are using setter injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
