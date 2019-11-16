package com.zking.ssm.service;

import com.zking.ssm.model.Customer;
import com.zking.ssm.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ICustomer {

    @Transactional(readOnly = true)
    Customer load(Customer customer);

    @Transactional(readOnly = true)
    List<Customer> selectByList(Customer customer, PageBean pageBean);

}
