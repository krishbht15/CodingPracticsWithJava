package com.company;

import java.util.Scanner;

public class BeautifulDays {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int start=s.nextInt();
        int stop= s.nextInt();
        int div=s.nextInt();
        sol(start,stop,div);

    }
    public static void sol(int start,int stop,int div){
        int x=0;

        for (int i = start; i <=stop ; i++) {
            int rev=reverse(i);
                int temp=(i-rev)%div;

                if(temp==0){

                    x++;
                }
        }
        System.out.println(x);}

        public static int reverse(int x){
        int temp=0;
        while (x>0){
            int rem=x%10;
         temp=temp*10+rem;
         x=x/10;
        }

        return temp;
        }
}
