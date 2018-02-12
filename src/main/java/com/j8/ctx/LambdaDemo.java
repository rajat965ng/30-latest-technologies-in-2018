package com.j8.ctx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaDemo {

    public static void main(String args[]){
        List<String> names = Arrays.asList("Prachi","Rajat","Kanchan","pradeep");

        Collections.sort(names,(a,b)->b.compareTo(a));

        System.out.println(names);
    }

}
