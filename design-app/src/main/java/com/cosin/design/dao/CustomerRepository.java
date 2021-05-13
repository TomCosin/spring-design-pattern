package com.cosin.design.dao;

import com.cosin.design.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository  extends CrudRepository<Customer,String> {

    Customer findCustomerByName(String lastName);

}
