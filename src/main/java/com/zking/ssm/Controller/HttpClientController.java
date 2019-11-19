package com.zking.ssm.Controller;

import com.zking.ssm.service.impl.HttpAPIService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HttpClientController {

    @Resource
    private HttpAPIService httpAPIService;

    @RequestMapping("httpclient")
    public String test() throws Exception {
        String str = httpAPIService.doGet("http://www.baidu.com");
        System.out.println(str);
        return "hello";
    }
}