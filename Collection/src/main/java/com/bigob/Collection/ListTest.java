package com.bigob.Collection;

import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main( String[] args ){
       List<String> lists=Arrays.asList("a","b","c","d");
 
       System.out.println(lists.toString());
       
       lists.forEach(System.out::print);
       
       System.out.println();
       
       System.out.println(lists.indexOf("a"));
    }
}
