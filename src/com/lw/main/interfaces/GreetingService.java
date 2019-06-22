package com.lw.main.interfaces;

@FunctionalInterface
public interface GreetingService {
    void sayMessage(String content);

    static void sayHello(){
        System.out.println("Hello world~");
    }


}
