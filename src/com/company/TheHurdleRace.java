package com.company;

import java.util.Scanner;

public class TheHurdleRace {
    public static void main(String[] args) {
//        Scanner s= new Scanner(System.in);
//        int y=s.nextInt();
//        int z=s.nextInt();
//        int[]x=new int[y];
//        for (int i = 0; i <y ; i++) {
//            x[i]=s.nextInt();
//        }
//        portion(x,z);
        System.out.println(String.format("\\u%04x", (int) 'b'));
        char x='\u0061'+1;
        System.out.println(x);
        System.out.println(String.valueOf('\u0060'));
    }
    public static void portion(int[] x, int a){
        int temp=0;
        for (int i = 0; i <x.length ; i++) {
            if(x[i]>a){
                if(temp<x[i]-a)
                temp=x[i]-a;
            }

        }
        System.out.println(temp);}

}
