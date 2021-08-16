package com.cosin.design.service;

import com.cosin.design.entity.Customer;
import com.cosin.design.entity.OptionLog;

public interface AsyncService {

    void saveOptionLog(OptionLog optionLog);

    void testTran(Customer customer);

}
