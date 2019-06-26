package com.company;

import java.util.Scanner;

public class SuperReducedString {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String ss=s.next();
        solution(ss);

    }

    public static void solution(String s) {
        for (int i = 1; i <s.length(); i++) {

            if(s.charAt(i)==s.charAt(i-1)){
                s=s.substring(0,i-1)+s.substring(i+1);
                i=0;

            }
        }
        if(s.length()==0){
            System.out.println("Empty string");
        }
        else {
            System.out.println(s);
        }

    }
}
