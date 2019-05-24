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
        int pp=ta[0];
        for (int i = 0; i <ta.length ; i++) {
            if(pp<ta[i]){
                pp=ta[i];
            }
        }
        int tt = 0;
        int temp = 0;
        boolean p = false;
        int[] res = new int[pp + 1];


        for (int j = 0; j <= pp; j++) {
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



        for (int i = 0; i <ta.length; i++) {

            System.out.println(res[ta[i]]);
        }

        }
    }
