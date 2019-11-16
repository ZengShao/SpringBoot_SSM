package com.zking.ssm.mapper;

import com.zking.ssm.model.Customer;

import java.util.ArrayList;
import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Long customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> selectByList(Customer customer);
}