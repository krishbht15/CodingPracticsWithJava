package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        SuperReducedString.solution("aaabccddd");
//        int x=s.nextInt();
//        int[] a=new int[x];
//        for (int i = 0; i <x ; i++) {
//            a[i]=s.nextInt();
//        }
//        int y=s.nextInt();
//        int[] b=new int[y];
//        for (int i = 0; i <y ; i++) {
//            b[i]=s.nextInt();
//        }
//        alicesScore(a,b);

    }

    public static void alicesScore(int[] scoreboard,int[] alice){
        int[] res=new int[scoreboard.length+1];
        int index=1;
        for (int i = 0; i <scoreboard.length; i++) {
            if(i==0) {
                res[index] = scoreboard[i];
                index++;

            }
            else {
                if(scoreboard[i]<scoreboard[i-1]){
                    res[index] = scoreboard[i];
                    index++;
                }
            }
        }



        int[] aliceRank=new int[alice.length];
        int t=1;
        for (int i = alice.length-1; i >=0 ; i--) {

            for (int j = t; j <res.length; j++) {
                if(alice[i]>=res[j]){
                    aliceRank[i]=j;
                    t=j;
                    break;
                }

            }
        }
        for (int i = 0; i < aliceRank.length; i++) {
            System.out.println(aliceRank[i]);
        }
    }

}
