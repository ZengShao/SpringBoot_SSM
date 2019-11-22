package com.zking.ssm.service;

import com.zking.ssm.model.Customer;
import com.zking.ssm.util.PageBean;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ICustomer {

    @CachePut(value = "CustomerCache",key = "'Customer-'+#customer.customerId")
    Customer add(Customer customer);

    @CachePut(value = "CustomerCache",key = "'Customer-'+#customer.customerId")
    Customer update(Customer customer);

    @CacheEvict(value = "CustomerCache",key = "'Customer-'+#customer.customerId")
    int del(Customer customer);

    @Transactional(readOnly = true)
    @Cacheable(value = "CustomerCache", key= "'Customer-'+#customer.customerId", unless = "#result == null")
    Customer load(Customer customer);

    @Transactional(readOnly = true)
    @Cacheable(value = "CustomerCache", keyGenerator=  "myKeyGenerator", unless = "#result.size() == 0")
    List<Customer> selectByList(Customer customer, PageBean pageBean);

}
