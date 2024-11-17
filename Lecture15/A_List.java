package Lecture15;

import java.util.ArrayList;
import java.util.Collections;

public class A_List {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr.size());
        arr.add(10);
        System.out.println(arr.size());
        arr.add(10);
        System.out.println(arr.size());
        arr.add(20);
        System.out.println(arr.size());
        arr.add(1,30);
        System.out.println(arr);
        System.out.println(arr.get(3));
        arr.remove(2);
        Collections.sort(arr);
        System.out.println(arr);

    }
}
