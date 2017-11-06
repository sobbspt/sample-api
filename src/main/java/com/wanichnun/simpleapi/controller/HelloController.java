package com.wanichnun.simpleapi.controller;

import com.wanichnun.simpleapi.model.ResponseModel;
import com.wanichnun.simpleapi.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping(path = "/hello/{name}")
    public HttpEntity<ResponseModel> getHello(
            @PathVariable(value = "name") String name
    ) {
        return new ResponseModel("success", helloService.getHello(name)).build(HttpStatus.OK);
    }
}
