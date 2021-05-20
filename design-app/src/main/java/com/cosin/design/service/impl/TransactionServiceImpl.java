package com.cosin.design.service.impl;

import com.cosin.design.dao.CustomerRepository;
import com.cosin.design.entity.Customer;
import com.cosin.design.entity.OptionLog;
import com.cosin.design.service.AsyncService;
import com.cosin.design.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;

@Service
public class TransactionServiceImpl implements TransactionService {


    @Autowired
    private AsyncService asyncService;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional
    public Customer addCustomer(Customer c) {
        customerRepository.save(c);
        return c;
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Customer updateCustomer(String id, BigDecimal c) {
//        System.out.println("-----进来了------");
//        try {
//            ex();
//        }catch (Exception ex){
//            System.out.println("--------out catch---------");
//        }finally {
//            System.out.println("--------out finally---------");
//        }
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        Customer customer = optionalCustomer.orElseThrow(NullPointerException::new);
        customer.setBalance(customer.getBalance().add(c));
        BigDecimal bigDecimal = Optional.ofNullable(customer.getBalance()).orElse(BigDecimal.ZERO);
        BigDecimal balance = customerRepository.getCust(id).orElseThrow(NullPointerException::new).getBalance();
        Customer save = customerRepository.save(customer);
        OptionLog optionLog = new OptionLog();
        optionLog.setId(UUID.randomUUID().toString());
        optionLog.setCreateTime(LocalDate.now());
        System.out.println("--------异步开始-----------");
        asyncService.saveOptionLog(optionLog);
        System.out.println("--------异步结束-----------");
        return null;
    }

    public void ex(){
        try {
            int i = 1/0;
        }catch (Exception ex){
            System.out.println("--------inner catch---------");
            throw ex;
        }finally {
            System.out.println("--------inner finally---------");
        }


    }


}
