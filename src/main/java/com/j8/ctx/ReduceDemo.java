package com.j8.ctx;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

    public static void main(String args[]){

     List<String> names = Arrays.asList("Prachi","Rajat","Kanchan","pradeep");

     Optional<String> stringOptional = names.stream().sorted().reduce((s1, s2) -> s1+"|"+s2);
        System.out.println(stringOptional.get());
    }
}
