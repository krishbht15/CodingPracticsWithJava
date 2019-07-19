package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortingAlgo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);


        int a=s.nextInt();
        int[] data=new int[a];

        for (int i = 0; i <a ; i++) {
        data[i]=s.nextInt();
        }
quickSortPartition(data);
    }
    public static void mergeSort(int[] data,int start,int end){
        if(start>=end){
            return;
        }

        int mid=(start+end)/2;

        mergeSort(data,start,mid);
        mergeSort(data,mid+1,end);

        mergeArray(data,start,end);
    }

    public static void mergeArray(int[] data, int start, int end) {

        int mid=(start+end)/2;
        int i=start;
        int j=mid+1;
        int k=start;
        int[] temp=new int[data.length];
        while (i<=mid && j<=end){

            if (data[i]<=data[j]){
                System.out.println(data[i]);
                temp[k++]=data[i++];
            }
            else {
                System.out.println(data[j]);

                temp[k++]=data[j++];
            }
        }
        while (i<=mid){
            temp[k++]=data[i++];
        }
        while (j<=end){
            temp[k++]=data[j++];
        }
        for (int l = 0; l <data.length ; l++) {
            data[l]=temp[l] ;}

    }
    public static void insertionSort(int[] data,int n){

        int tem=data[data.length-1];
        int index=data.length-1;
        for (int i = data.length-2;i>=0; i--) {
            if(data[i]>tem){
               data[index]=data[i];
               index=i;
               print(data);
                System.out.println();
            }

            data[index]=tem;

    }
        print(data);
    }
    public static void insertion(int n,int[] data){
//17425
        //12457
        for (int i = 1; i <data.length ; i++) {
            int key=data[i];
            int j=i-1;
            while (j >= 0 && data[j] > key) {
                data[j+1]=data[j];
                j=j-1;

            }

            data[j+1]=key;
            print(data);
            System.out.println();
        }

    }

    private static void swap(int[] data, int x, int i) {
        int tem=data[x];
        data[x]=data[i];
        data[i]=tem;

    }

    public static void print(int[] data){
        for (int i = 0; i <data.length ; i++) {
            System.out.print(data[i]+" ");
        }
    }
    public static void quickSortPartition(int[] data){
        int pivot=data[0];
        ArrayList<Integer> leftt=new ArrayList<>();
        ArrayList<Integer> rightt=new ArrayList<>();

        String left="";
        String right="";
        for (int i = 1; i < data.length; i++) {
            if(data[i]<pivot){
//                left=left+data[i];
leftt.add(data[i]);
            }
            else {
//                right=right+data[i];
                rightt.add(data[i]);

            }
        }
        int c=0;
        for (int i = 0; i <leftt.size() ; i++) {
        data[c]=leftt.get(i);

        c++;
        }
        data[c]=pivot;
        c++;
        for (int i = 0; i <rightt.size() ; i++) {
            data[c]=rightt.get(i);
            c++;
        }
        print(data);
    }
    public static int[] countingStars(int[] data){
        Map<Integer,Integer>a=new HashMap<>();
        int[] temp
        for (int i = 0; i <data.length ; i++) {
                a.put(data[i],a.get(data[i])+1);
        }
        return temp;
    }
    }

