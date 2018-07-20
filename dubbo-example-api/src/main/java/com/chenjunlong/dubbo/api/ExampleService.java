package com.chenjunlong.dubbo.api;

import com.github.jratelimit.annotation.RateLimit;

/**
 * Created by chenjunlong on 2018/7/19.
 */
public interface ExampleService {

    //@RateLimit(defaultMethod = "sayHelloDefaultMethod")
    @RateLimit
    String sayHello();

    String sayHelloDefaultMethod();

    @RateLimit(defaultMethod = "sayHelloDefaultMethod2")
    String sayHello2(String name);

    String sayHelloDefaultMethod2(String name);

    @RateLimit(defaultMethod = "sayHelloDefaultMethod3")
    String sayHello3(String name, Integer age);

    String sayHelloDefaultMethod3(String name, Integer age);
}
