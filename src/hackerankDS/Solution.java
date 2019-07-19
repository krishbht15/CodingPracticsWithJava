package hackerankDS;

import java.util.Scanner;

public class Solution {
    static int x=0;

    public static void main(String[] args) {
//        Scanner s= new Scanner(System.in);
//        String a=s.next();
//        String b=s.next();
//
//        int aV=0,bV=0;
//        for (int i = 0; i <a.length() ; i++) {
//            aV=aV+check(a.charAt(i));
//        }
//        for (int i = 0; i <b.length() ; i++) {
//            bV=bV+check(b.charAt(i));
//        }
//    if(aV>bV){
//        System.out.println("Erica");
//    }
//    else if(aV<bV){
//        System.out.println("Bob");
//    }
//    else {
//        System.out.println("Tie");
//    }
        String a="ae";
//        System.out.println(a.contains("ae"));
        permu("aeiou","",3);
        System.out.println(x%(10^9+7));
    }


    public static void permu(String ques,String  ans,int n){
        if(ans.length()==n){
            if(ans.contains("ai") ||ans.contains("ao") ||ans.contains("au")||ans.contains("eo")||ans.contains("eu")|| ans.contains("ii")||ans.contains("oa")||ans.contains("oe")||ans.contains("ue")||ans.contains("ui")||ans.contains("uo")||ans.contains("uu")||ans.contains("oo")||ans.contains("aa")||ans.contains("ee")){

                return;
            }
            else {
//                System.out.println(ans);
           x++;
                return;
            }
        }
//        if(ans.length()>0&&ans.charAt(ans.length()-1)=='a'){
//            permu(ques,ans+ques.charAt(1),n);
//        }
//        if(ans.length()>1&&ans.substring(ans.length()-2,ans.length()-1).contains("ae")){
//            permu(ques,ans+ques.charAt(1),n);
//            permu(ques,ans+ques.charAt(2),n);
//
//        }
//        if(ans.length()>2&&ans.substring(ans.length()-3,ans.length()-1).contains("aea")){
//            permu(ques,ans+ques.charAt(1),n);
//
//
//        }
//        if(ans.length()>2&&ans.substring(ans.length()-3,ans.length()-1).contains("aei")){
//            permu(ques,ans+ques.charAt(1),n);
//            permu(ques,ans+ques.charAt(0),n);
//            permu(ques,ans+ques.charAt(3),n);
//            permu(ques,ans+ques.charAt(4),n);
//
//
//        }

        for (int i = 0; i <ques.length() ; i++) {
            char ch=ques.charAt(i);
if(ans.length()>0&&ans.charAt(ans.length()-1)=='a'){
    permu(ques,ans+ques.charAt(1),n);
}
if(ans.substring(ans.length()-2,ans.length()-1).contains("ae")){
    permu(ques,ans+ques.charAt(1),n);
    permu(ques,ans+ques.charAt(2),n);

}
            if(ans.substring(ans.length()-3,ans.length()-1).contains("aea")){
                permu(ques,ans+ques.charAt(1),n);


            }
            if(ans.substring(ans.length()-3,ans.length()-1).contains("aei")){
                permu(ques,ans+ques.charAt(1),n);
                permu(ques,ans+ques.charAt(0),n);
                permu(ques,ans+ques.charAt(3),n);
                permu(ques,ans+ques.charAt(4),n);


            }

//            String rq=ques.substring(0,i)+ques.substring(i+1);
            String temp=ans+ch;
//            if(temp.contains("ai") ||temp.contains("ao") ||temp.contains("au")||temp.contains("eo")||temp.contains("eu")|| temp.contains("ii")||temp.contains("oa")||temp.contains("oe")||temp.contains("ue")||temp.contains("ui")||temp.contains("uo")||temp.contains("uu")||temp.contains("oo")||temp.contains("aa")||temp.contains("ee")){
//
//                return;
//            }
            if(ans.contains("ai") ||ans.contains("ao") ||ans.contains("au")||ans.contains("eo")||ans.contains("eu")|| ans.contains("ii")||ans.contains("oa")||ans.contains("oe")||ans.contains("ue")||ans.contains("ui")||ans.contains("uo")||ans.contains("uu")||ans.contains("oo")||ans.contains("aa")||ans.contains("ee")){

              return;
            }
else {
                permu(ques, temp, n);
            }
        }
    }
    public static int check(char a){
        if(a=='E' || a=='e'){
            return  1;

        }
        if(a=='M' || a=='m'){
            return  3;

        }
        return 5;
    }
}
