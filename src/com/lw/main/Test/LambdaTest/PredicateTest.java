package com.lw.main.Test.LambdaTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args){
        List languages = Arrays.asList("Java","C++","Python");

        System.out.println("language start with J");
        filter(languages,str->str.toString().startsWith("J"));

        System.out.println("language start with C");
        languages.stream().filter(str->str.toString().startsWith("C")).forEach(System.out::println);

    }

    private static void filter(List list, Predicate condition){
        list.forEach(element->{
            if(condition.test(element)){
                System.out.println(element);
            }
        });

    }
}
