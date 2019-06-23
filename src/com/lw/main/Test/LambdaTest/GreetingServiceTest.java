package com.lw.main.Test.LambdaTest;

import com.lw.main.interfaces.GreetingService;

public class GreetingServiceTest {
    public static  void  main(String[] args){
        GreetingService greetingService1 = (message)->{ System.out.println("hello " + message); };

        greetingService1.sayMessage("winnie");


    }
}
