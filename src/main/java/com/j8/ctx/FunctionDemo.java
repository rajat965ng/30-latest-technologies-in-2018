package com.j8.ctx;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String args[]){
        Function<String,Integer> dontKnow = Integer::valueOf;
        System.out.println(dontKnow.apply("123"));
    }

}
