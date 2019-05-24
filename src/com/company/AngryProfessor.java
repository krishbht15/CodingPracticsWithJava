package com.company;

import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int testcases=s.nextInt();
        for (int i = 0; i <testcases ; i++) {


            int a = s.nextInt();
            int k = s.nextInt();
            int[] timing = new int[a];
            for (int j = 0; j < a; j++) {
                timing[j] = s.nextInt();
            }
            sol(timing,k);
        }
    }

    public static void sol(int[]timing,int k){
    int temp=timing.length;
        for (int i = 0; i <timing.length ; i++) {
         if (timing[i]>0){
             temp--;
         }
        }
        if(temp>=k){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
