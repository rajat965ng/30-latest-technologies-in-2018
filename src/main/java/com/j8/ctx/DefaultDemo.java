package com.j8.ctx;

interface Formula{
    double calculate(int a);

    default double sqrt(int a){
        return Math.sqrt(a);
    }
}

public class DefaultDemo {
    public static void main(String args[]){
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a);
            }
        };

        System.out.println(formula.calculate(9));
        System.out.println(formula.sqrt(16));
    }
}
