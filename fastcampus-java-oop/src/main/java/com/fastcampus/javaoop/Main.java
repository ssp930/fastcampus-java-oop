package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> mainSort = new BubbleSort<>();

        System.out.println("result : " + mainSort.sort(Arrays.asList(args)));
    }
}
