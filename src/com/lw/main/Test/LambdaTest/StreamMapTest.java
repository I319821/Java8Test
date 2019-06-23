package com.lw.main.Test.LambdaTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapTest {
    public static void main(String[] args){
        List list = Arrays.asList(500,700,900);

        list.stream().map(elem->Double.parseDouble(elem.toString()) * 0.8).forEach(System.out::println);

        List languages = Arrays.asList("Java", "C++", "Python");

        List language1 = (List) languages.stream().filter(str -> str.toString().length() > 3).collect(Collectors.toList());
        System.out.println("Language Name longer than 3:");
        language1.forEach(System.out::println);

        String languages2 = (String) language1.stream().collect(Collectors.joining(","));
        System.out.println("languages:" + languages2);

        List duplicateList = Arrays.asList("Java","Java","C++","Python");
        duplicateList.stream().distinct().forEach(System.out::println);


    }
}
