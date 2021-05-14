package com.cosin.design.service.impl;

import com.cosin.design.dao.CustomerRepository;
import com.cosin.design.entity.Customer;
import com.cosin.design.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.function.Supplier;

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
    public Customer updateCustomer(String id, BigDecimal c) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        Customer customer = optionalCustomer.orElseThrow(NullPointerException::new);
        customer.setBalance(customer.getBalance().add(c));
        BigDecimal balance1 = customerRepository.findById(id).orElseThrow(NullPointerException::new).getBalance();
        Customer save = customerRepository.save(customer);
        BigDecimal balance = customerRepository.findById(id).orElseThrow(NullPointerException::new).getBalance();
        return save;
    }
}
