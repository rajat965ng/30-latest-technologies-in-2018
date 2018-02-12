package com.j8.ctx;

import java.time.Clock;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class MapDemo {
    public static void main(String args[]){
        Map<Integer,String> map = new HashMap<>();

        IntStream.range(0,10).forEach(e->map.put(e+1,"Val:"+(e+1)));

        map.forEach((a, b) -> System.out.println(b) );

        map.computeIfPresent(3,(integer, s) -> integer+s );
        System.out.println(map.get(3));

        Date date = Date.from(Clock.systemDefaultZone().instant());
    }
}
