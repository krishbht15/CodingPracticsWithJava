package com.company;

import java.util.Scanner;

/*     HackerLand Enterprise is adopting a new viral advertising strategy. When they launch a new product, they advertise it to exactly  people on social media.

                On the first day, half of those  people (i.e., ) like the advertisement and each shares it with  of their friends. At the beginning of the second day,
                people receive the advertisement.

                Each day,  of the recipients like the advertisement and will share it with  friends on the following day.
                 Assuming nobody receives the advertisement twice, determine how many people have liked the ad by the end of a given day,
                  beginning with launch day as day .

                For example, assume you want to know how many have liked the ad by the end of the  day.
*/
public class ViralAdvertising {

       public static void main(String[] args) {
           Scanner s=new Scanner(System.in);
           int a=s.nextInt();
           sol(a);

       }
       public static void sol(int a){
            int nomberofpeople=5;
            int res=0;
            int x=0;
           for (int i = 1; i <=a ; i++) {
                x=(nomberofpeople/2)+x;
               res=(nomberofpeople/2)*3;
               nomberofpeople=res;
           }
                          System.out.println(x);
       }
}
