package com.sac;

import java.util.Arrays;
import java.util.List;

public class ArrayConversion {

    public static void main(String[] args) {
        String[] stringArray = {"Sachin", "Naik"};
        List<String> list = Arrays.asList(stringArray);
        System.out.println(list.size());
        list.set(1,"Dravid");
        stringArray[0]="Rahul";

        for (String a : stringArray) {
            System.out.println(a + " ");
        }

        list.remove(0); // This will throw UnsupportedOperationException.
    }
}
