package com.zking.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.mapper.CustomerMapper;
import com.zking.ssm.model.Customer;
import com.zking.ssm.service.ICustomer;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class ICustomerImpl implements ICustomer {

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public Customer load(Customer customer) {
        return customerMapper.selectByPrimaryKey(customer.getCustomerId());
    }

    @Override
    public List<Customer> selectByList(Customer customer,PageBean pageBean) {

        if (null != pageBean && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        List<Customer> objects = customerMapper.selectByList(customer);
        if (null != pageBean && pageBean.isPagination()){
            PageInfo pageInfo = new PageInfo(objects);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return objects;
    }
}
