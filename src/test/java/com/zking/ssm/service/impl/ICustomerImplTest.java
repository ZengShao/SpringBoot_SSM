package com.zking.ssm.service.impl;

import com.zking.ssm.model.Customer;
import com.zking.ssm.service.ICustomer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.awt.print.Book;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
class ICustomerImplTest {

    @Autowired
    ICustomer iCustomer;

    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void load() {
        customer.setCustomerId(2l);
        Customer del = iCustomer.load(customer);
        System.out.println(del);
    }

}