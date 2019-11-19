package com.zking.ssm.Controller;

import com.zking.ssm.model.Customer;
import com.zking.ssm.service.ICustomer;
import com.zking.ssm.util.JsonData;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Autowired
    ICustomer iCustomer;

    private Customer customer;

    @GetMapping("/load")
    public JsonData load(Customer customer) {

        JsonData jsonData = new JsonData();

        Customer del = iCustomer.load(customer);
        System.out.println(
                del
        );

        jsonData.setResult(del);


        return jsonData;
    }

    @RequestMapping("/CustomerList")
    public @ResponseBody
    JsonData CustomerList( PageBean pageBean, Customer customer) {
        JsonData jsonData = new JsonData();

        if(null == customer.getCustomerName()){
            customer.setCustomerName("");
        }
        if (null != customer.getCustomerName()){
            customer.setCustomerName(customer.getCustomerName());
            System.out.println(customer.getCustomerName());
        }
        List<Customer> objects = iCustomer.selectByList(customer,pageBean);

        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setPage(pageBean.getPage());
        jsonData.setResult(objects);

        redisTemplate.opsForValue().set("www",jsonData);

        return jsonData;
    }
}
