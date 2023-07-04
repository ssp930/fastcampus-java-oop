package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort<String> mainSort = new BubbleSort<>();

        System.out.println("result : " + mainSort.sort(Arrays.asList(args)));
    }
}
