package com.books.dubbo.demo.api;

public class GreetingServiceStub implements GreetingService {

    private GreetingService greetingService;

    public GreetingServiceStub(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    @Override
    public String sayHello(String name) {
        System.out.println("开始远程调用了");
        String str = greetingService.sayHello(name);
        System.out.println("结束远程调用");
        return str;
    }

    @Override
    public Result<String> testGeneric(PoJo poJo) {
        return null;
    }
}
