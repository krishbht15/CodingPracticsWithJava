package com.company;

import java.util.Scanner;

public class DesignerPdfViewer {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] alphabets=new int[26];
        for (int i = 0; i <alphabets.length ; i++) {
            alphabets[i]=s.nextInt();
        }
        String x=s.next();
        heightFind(alphabets,x);
    }
    public static void heightFind(int[]a,String  x){
        int height=0;
        for (int j = 0; j <x.length() ; j++) {
            for (int i = 0; i < a.length; i++) {
                char temp= (char) ('\u0060'+i+1);

                    if(temp==x.charAt(j)){

                     if(height<a[i]){
                         height=a[i];
                     }
                    }
            }
        }

        System.out.println(x.length()*height);}
}
