package com.cosin.design.service.impl;

import com.cosin.design.dao.CustomerRepository;
import com.cosin.design.entity.Customer;
import com.cosin.design.entity.OptionLog;
import com.cosin.design.service.AsyncService;
import com.cosin.design.service.TransactionService;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TransactionServiceImpl implements TransactionService {


    @Autowired
    private AsyncService asyncService;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private EntityManager em;

    @Override
    @Transactional
    public Customer addCustomer(Customer c) {
        customerRepository.save(c);
        return c;
    }

    @Override
    @Transactional
    public Customer updateCustomer(String id, BigDecimal c) {
        Optional<Customer> customer = customerRepository.findById(id);
        customer.ifPresent(a -> {
            a.setBalance(c);
            customerRepository.save(a);
        });
        return null;
    }


}
