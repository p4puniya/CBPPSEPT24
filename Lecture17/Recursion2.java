package Lecture17;

public class Recursion2 {
    static void printSubSeq(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char a = ques.charAt(0);
        // Include
        printSubSeq(ques.substring(1), ans+a);
        // Don't Include
        printSubSeq(ques.substring(1), ans);
    }

    static void coinToss(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        coinToss(n-1, ans+"H ");
        coinToss(n-1, ans+"T ");
    }


    static int countSubSeq(String ques, String ans){
        if(ques.length()==0){
            return 1;
        }
        char a = ques.charAt(0);
        // Include
        int inc= countSubSeq(ques.substring(1), ans+a);
        // Don't Include
        int Ninc= countSubSeq(ques.substring(1), ans);

        return inc+ Ninc;
    }

    static void generateParanthesis(int n, int l, int r, String ans){
        if(n==l && l==r){
            System.out.println(ans);
            return;
        }
        //Handling Invalid Cases
        if(l>n || r>l)
            return;
        generateParanthesis(n, l+1, r, ans+"{ ");
        generateParanthesis(n, l, r+1, ans+"} ");
    }

    static void printPerm(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++){
            char a= ques.charAt(i);
            String s1= ques.substring(0, i);
            String s2= ques.substring(i+1);
            printPerm(s1+s2, ans+a);
        }
    }

    //22
    public static void main(String[] args) {
        String s= "car";
        // printSubSeq(s, "");
        // coinToss(3, "");
        // System.out.println(countSubSeq(s, ""));
        // generateParanthesis(3, 0, 0, "");
        printPerm("abc", "");
    }
}
