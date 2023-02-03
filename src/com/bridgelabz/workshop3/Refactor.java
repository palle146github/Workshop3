package com.bridgelabz.workshop3;

import java.util.ArrayList;
import java.util.List;

public class Refactor {
    public static void main(String[] args) {
        System.out.println("Distinct elements from Two arrays");
        int[] array1 = {1, 5, 8, 3, 18, 38, 29, 46};
        int[] array2 = {4, 6, 28, 58, 27, 48, 84};
        List<Integer> arraList = new ArrayList<>();
        int len1 = array1.length;
        int len2 = array2.length;
        int length = len1 + len2;
        int[] array3 = new int[length];
        int x = 0;
        for (int i = 0; i < len1; i++) {
            int temp = array1[i];
            array3[x++] = array1[i];
            for (int j = 0; j < len2; j++) {
                if (array1[i] != array2[j]) {
                    array3[x++] = array2[j];
                }
            }
        }
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                System.out.println(array3[i]);
            }
        }


    }
}

