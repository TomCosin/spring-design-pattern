package com.cosin.design.service;

import com.cosin.design.entity.Customer;

import java.math.BigDecimal;

public interface TransactionService {

    Customer addCustomer(Customer c);

    Customer updateCustomer(String id, BigDecimal c);

}
