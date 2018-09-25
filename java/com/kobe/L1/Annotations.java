package com.kobe.L1;

import java.lang.reflect.Method;

public class Annotations {
    @com.kobe.L1.Tester(status = com.kobe.L1.Tester.Status.process)
    public int add(int a){
        return a+1;
    }

    public static void main(String[] args){
        Class<Annotations> c = Annotations.class;
        try {
            Method m = c.getMethod("add", int.class);
            Tester tester =  m.getAnnotation(Tester.class);
            System.out.println(tester.status().getDes());
            System.out.println(tester.ok());
            System.out.println(tester.name());

        } catch (NoSuchMethodException e) {
            System.out.println("No method!!!!");
        }
    }
}
