package ru.geekbrains.junior.lesson1.hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5,6 ,7 ,8 ,9 ,10));
        System.out.println(
                list.stream().
                filter(i -> i%2==0)
                .mapToInt(e -> e).
                average()
                        .getAsDouble()
        );

    }

}