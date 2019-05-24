package com.company;

import java.util.Scanner;

/*John Watson knows of an operation called a right circular rotation on an array of integers. One rotation operation moves the last array element to the first position and shifts all remaining elements right one. To test Sherlock's abilities, Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operation a number of times then determine the value of the element at a given position.

For each array, perform a number of right circular rotations and return the value of the element at a given index.

For example, array , number of rotations,  and indices to check, .
First we perform the two rotations:

Now return the values from the zero-based indices  and  as indicated in the  array.
 */
public class CircularRotationArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int[] x = new int[a];
        for (int i = 0; i < a; i++) {
            x[i] = s.nextInt();
        }
        int[] q = new int[c];
        for (int i = 0; i < c; i++) {
            q[i] = s.nextInt();
        }
        sol(x, q, b);
    }

    public static void sol(int[] integer, int[] queries, int rotation) {
        int c = integer.length-1;
        int[] temp = new int[integer.length];



        for (int i = 0; i <integer.length ; i++) {
            int b=i+rotation;
            if(c==b){
            temp[b]=integer[i];
            }
            if(b>c) {
                while (b > c) {
                    b = b - c;
                }
                b=b-1;
                temp[b]=integer[i];
            }
            if(b<c){
temp[b]=integer[i];
            }

        }
        for (int i = 0; i < queries.length; i++) {
            System.out.println(temp[queries[i]]);
        }
    }
}
