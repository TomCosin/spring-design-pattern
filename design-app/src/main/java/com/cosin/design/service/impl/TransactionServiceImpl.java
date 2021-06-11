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
        System.out.println("-----进来了------");
        ex();
//        try {
//            ex();
//        }catch (Exception ex){
//            System.out.println("--------out catch---------");
//        }finally {
//            System.out.println("--------out finally---------");
//        }
//        Optional<Customer> optionalCustomer = customerRepository.findById(id);
//
//        Customer customer = optionalCustomer.orElseThrow(NullPointerException::new);
//        customer.setBalance(customer.getBalance().add(c));
//        customerRepository.save(customer);
//
//
//        BigDecimal balance = customerRepository.getCust(id).orElseThrow(NullPointerException::new).getBalance();
//        System.out.println("完成了");
        return null;
    }

    public static void main(String[] args) {
        ex();
    }

    public static void ex(){
        try {
            int i = 1/0;
        }catch (Exception ex){
            System.out.println("--------inner catch---------");
            throw ex;
        }finally {
            System.out.println("--------inner finally---------");
            throw new NullPointerException();
        }


    }


}
