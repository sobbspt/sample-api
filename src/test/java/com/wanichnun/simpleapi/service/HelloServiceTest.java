package com.wanichnun.simpleapi.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import java.util.Map;

public class HelloServiceTest {

    private HelloService helloService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        helloService = new HelloService();
    }

    @Test
    public void testGetHello() {
        String name = "ascend";

        Map<String, Object> actual = helloService.getHello(name);

        Assert.assertEquals("Hello ascend", actual.get("greeting"));
        Assert.assertEquals("Your name length is 6", actual.get("info"));
    }
}
