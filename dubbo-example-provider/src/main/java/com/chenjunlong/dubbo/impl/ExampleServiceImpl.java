package com.chenjunlong.dubbo.impl;

import com.chenjunlong.dubbo.api.ExampleService;

/**
 * Created by chenjunlong on 2018/7/19.
 */
public class ExampleServiceImpl implements ExampleService {

    @Override
    public String sayHello() {
        return "sayHello";
    }

    @Override
    public String sayHelloDefaultMethod() {
        return "sayHelloDefaultMethod";
    }

    @Override
    public String sayHello2(String name) {
        return "sayHello2 " + name;
    }

    @Override
    public String sayHelloDefaultMethod2(String name) {
        return "sayHelloDefaultMethod2 " + name;
    }

    @Override
    public String sayHello3(String name, Integer age) {
        return "sayHello3 " + name + " " + age;
    }

    @Override
    public String sayHelloDefaultMethod3(String name, Integer age) {
        return "sayHelloDefaultMethod3 " + name + " " + age;
    }
}
