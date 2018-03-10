package com.sac;

import java.util.ArrayList;
import java.util.List;

public class ListConversion {

    public static void main(String[] args) {
       List<String> list = new ArrayList<>();
       list.add("Sachin");
       list.add("Naik");
       Object[] objectArray = list.toArray();
       System.out.println(objectArray.length);
       String[] stringArray = list.toArray(new String[0]);
       System.out.println(stringArray.length);

    }
}
