package com.chenjunlong.dubbo;

import com.chenjunlong.dubbo.api.ExampleService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by chenjunlong on 2017/11/10.
 */
public class DubboConsumerMain {

    private final static ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("classpath:dubbo-consumer-config.xml");

    private static ExampleService exampleService = (ExampleService) context.getBean("exampleService");

    public static void main(String[] args) throws ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 20; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    String result = exampleService.sayHello();
                    System.out.println("result=" + result);
                }
            });
        }
        System.exit(0);
    }

}
