package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int[] a = new int[x];
        for (int i = 0; i < x; i++) {
            a[i] = s.nextInt();
        }
        height(a);
    }

    public static void height(int[] ta) {
        int[] x=ta;
        Arrays.sort(x);
        int tt = 0;
        int temp = 0;
        boolean p = false;
        int[] res = new int[x[x.length - 1] + 1];

        for (int j = 0; j <= x[x.length - 1]; j++) {
            if (!p) {
                temp++;
                res[j] = temp;
                p=true;
            } else {
                temp = temp * 2;
                res[j] = temp;
                p=false;
            }

        }
        for (int i = 0; i < ta.length; i++) {
            System.out.println(ta[i]);
            for (int j = 0; j < res.length; j++) {
                if (j == ta[i]) {

                    System.out.println(res[j]);
                }
            }

        }
    }
}