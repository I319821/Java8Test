package com.lw.main.Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamStatisticsTest {
    public static void main(String[] args){

        List numbers = Arrays.asList(100,200,300,400);

        IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt((x) -> (int) x).summaryStatistics();
        double average = intSummaryStatistics.getAverage();
        System.out.println("average is " + average);
        int max = intSummaryStatistics.getMax();
        System.out.println("max is " + max);
        int min = intSummaryStatistics.getMin();
        System.out.println("minimum is " + min  );
        long sum = intSummaryStatistics.getSum();
        System.out.println("sum is " + sum);


    }
}
