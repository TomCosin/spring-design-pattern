package com.cosin.design.service.impl;

import com.cosin.design.dao.CustomerRepository;
import com.cosin.design.dao.OptionLogRepository;
import com.cosin.design.entity.Customer;
import com.cosin.design.entity.OptionLog;
import com.cosin.design.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AsyncServiceImpl implements AsyncService {

    @Autowired
    private OptionLogRepository optionLogRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Async("dataSaveExecutor")
    @Override
    public void saveOptionLog(OptionLog optionLog){
        optionLogRepository.save(optionLog);
    }

    @Override
    @Transactional
    public void testTran(Customer customer) {
        Customer customerByName = customerRepository.findCustomerByName(customer.getName());
        customerByName.setName("123213");
        customerRepository.save(customerByName);
    }

}
