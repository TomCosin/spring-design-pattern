package com.cosin.design.dao;

import com.cosin.design.entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.NamedNativeQuery;
import java.util.Optional;

public interface CustomerRepository  extends CrudRepository<Customer,String> {

    Customer findCustomerByName(String lastName);

    @Query(value = "select * from customer where id = ?1",nativeQuery = true)
    Optional<Customer> getCust(String id);

}
