package com.lw.main.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VariablesInLambdaTest {
    public static void main(String[] args){

        final List mutableList= new ArrayList();
        //int count = 0;

        List list = Arrays.asList(100,200,300,400);
        list.stream().forEach(x->{
            mutableList.add(x);
        });

        mutableList.forEach(System.out::println);


    }

}
