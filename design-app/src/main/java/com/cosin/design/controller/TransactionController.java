package com.cosin.design.controller;

import com.cosin.design.entity.Customer;
import com.cosin.design.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/add")
    public Customer addCustomer(){
        Customer customer = new Customer();
        customer.setId("007");
        customer.setName("愚玄");
        return transactionService.addCustomer(customer);
    }

    @GetMapping("/update")
    public Customer update(String name){
        return transactionService.updateCustomer(name);
    }

}
