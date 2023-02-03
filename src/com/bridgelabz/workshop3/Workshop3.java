package com.bridgelabz.workshop3;

public class Workshop3 {
    public static void distinctElement(int[] array, int n){
        for (int i = 0; i < n; i++) {
            int k;
            for (k = 0; k < i; k++)
                if (array[i] == array[k])
                    break;
            if (i == k)
                System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] array1 = {1, 5, 8, 3, 18, 38, 9, 58, 48, 84, 29, 46};
        int[] array2 = {4, 6, 28, 1, 3, 1, 3, 8, 58, 27, 48, 84};
        int length2 = array1.length + array2.length;
        int[] arraycombine = new int[length2];
        int x = 0;
        for (int i = 0; i < array2.length; i++) {
            arraycombine[i] = array1[i];
        }
        int j = array1.length;
        for (int i = 0; i < array2.length; i++) {
            arraycombine[j++] = array2[i];
        }
        distinctElement(arraycombine, length2);

    }
}
