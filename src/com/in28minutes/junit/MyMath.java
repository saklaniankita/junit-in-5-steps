package com.in28minutes.junit;



import java.util.Arrays;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class MyMath {
    public Optional<Integer>


    calculateSum(Integer[] numbers){
        BinaryOperator<Integer> binaryOperator = (a,b) -> (a+b);
        return Arrays.stream(numbers).reduce(binaryOperator);
    }

    public static void main(String[] args) {
        System.out.println(new MyMath().calculateSum(new Integer[]{1, -1}));
    }
}
