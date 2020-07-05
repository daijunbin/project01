package com.atguigu.java;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        System.out.println("args = [" + args + "]");
        int num =10;
        System.out.println("num = " + num);
        System.out.println("args = " + args);

        System.out.println("hello");
        String[] arr =new String[]{"tom","jery","haorui","qinqin"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(234);
        list.add(4323);
        if (list == null) {
            
        }
        if (list != null) {
            
        }
        if (list != null) {

        }
        if (list == null) {

        }
        for (Object o : list) {
            
        }
    }

    public static void meth() {
        System.out.println("Test.meth");
    }
}
