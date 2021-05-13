package com.cosin.design.service.impl;

import com.cosin.design.dao.CustomerRepository;
import com.cosin.design.entity.Customer;
import com.cosin.design.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional
    public Customer addCustomer(Customer c) {
        customerRepository.save(c);
        return c;
    }

    @Override
    @Transactional
    public Customer updateCustomer(String c) {
        Customer customer = customerRepository.findCustomerByName(c);
        customer.setName("修改了");
        Customer save = customerRepository.save(customer);
        return save;
    }
}
