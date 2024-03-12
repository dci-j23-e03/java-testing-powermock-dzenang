package com.dci.powermock;

public class Utility {

    private static HelloService helloService;
    private GreetingService greetingService;

    public static String sayHello(String name) {
        return helloService.sayHello(name);
    }

    public String getGreetingMessage(String name) {
        return getMessage(name);
    }

    private String getMessage(String name) {
        return greetingService.getGreetingMessage(name);
    }

    public final String getCongratsMessage(String name) {
        return greetingService.getCongratsMessage(name);
    }

    public String sendHelloMessage(String name) {
        String hello = sayHello(name);
        System.out.println(hello);
        return hello;
    }

    public String sendCongratsMessage(String name) {
        String hello = getCongratsMessage(name);
        System.out.println(hello);
        return hello;
    }
}