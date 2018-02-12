package com.j8.ctx;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String args[]){
        Predicate<String> predicate = s -> s.length()>0;
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("hello"));
        System.out.println(predicate.negate().test("hello"));

        System.out.println("Predicate Boolean.");
        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        System.out.println(nonNull.test(null));
        System.out.println(isNull.test(Boolean.FALSE));

    }

}
