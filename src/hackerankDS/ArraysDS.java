package hackerankDS;

import java.util.Scanner;

public class ArraysDS {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x=s.nextInt();
        String[] ss=new String[x];
        for (int i = 0; i <x ; i++) {
            ss[i]=s.next();
        }

     int bb=s.nextInt();
        String[] q=new String[bb];
        for (int i = 0; i <bb ; i++) {
            q[i]=s.next();
        }
        int[] ans= solution(q,ss);
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(ans[i]);
        }
    }



    public static int[] solution(String  a[],String b[]){
        int[] temp= new int[a.length];
        int count=0;

        for (int i = 0; i <a.length; i++) {
            int temp1=0;
            for (int j = 0; j <b.length ; j++) {
                if(a[i].equals(b[j])){
                    temp1++;
                }
            }
            temp[count]=temp1;
            count++;
        }
        return  temp;
    }

}


