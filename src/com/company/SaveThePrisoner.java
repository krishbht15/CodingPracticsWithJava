package com.company;
/*
A jail has a number of prisoners and a number of treats to pass out to them. Their jailer decides the fairest
way to divide the treats is to seat the prisoners around a circular table in sequentially numbered chairs.
A chair number will be drawn from a hat.
Beginning with the prisoner in that chair, one candy will be handed to each prisoner sequentially around the table until all have been distributed.
The jailer is playing a little joke, though. The last piece of candy looks like all the others, but it tastes awful.
Determine the chair number occupied by the prisoner who will receive that candy.
For example, there are  prisoners and  pieces of candy. The prisoners arrange themselves in seats numbered  to .
Let's suppose two is drawn from the hat.
Prisoners receive candy at positions . The prisoner to be warned sits in chair number .
*/

import java.util.Scanner;

public class SaveThePrisoner {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int testcase=s.nextInt();
        for (int i = 0; i <testcase ; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            sol(a,b,c);
        }
//        sol(944675683 ,944675683 ,20312);

    }

public static void sol(int a,int b,int c){
    c=c-1;
//    if(b>a) {
    if(a==b && c==0){
        if(a==944675683){
            System.out.println("meeeeeeeeeeee"+a);
        }
        System.out.println(a);
        return;
    }
    if(a-c>b){
        if(c+b==944675683){
            System.out.println("meeeeeeeeeeee"+a);
        }
        System.out.println(c+b);
        return;
    }
        b = b - (a - c);
//    }
//    else {
//        System.out.println(c+b);
//        return;
//    }
    if(b<=a){
        if(b==944675683){
            System.out.println("meeeeeeeeeeee"+a);
        }
        System.out.println(b);
    }
    else {
      int xx=b%a;
      if(xx==0){
          if(a==944675683){
              System.out.println("meeeeeeeeeeee"+a);
          }
          System.out.println(a);
      }
      else {
          if(xx==944675683){
              System.out.println("meeeeeeeeeeee"+a);
          }
          System.out.println(xx);
      }
    }
}
}
