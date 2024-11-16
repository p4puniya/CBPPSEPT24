package Lecture14;

public class Str {
    public static void main(String[] args) {
        // String s1= "A";
        // String s2= "C";
        // String s3= new String("Pacman");
        // int[] arr = new int[10];
        // char[] s4= new char[10];
        // System.out.println(s4.length);
        // s4[0]='h';
        // s4[1]='i';
        // System.out.println(s4);
        // System.out.println(arr);
        // System.out.println(s1==s2);
        // System.out.println(s2==s3);
        // System.out.println(s3==s1);
        // System.out.println(s1.compareTo(s2));
        // System.out.println(s3.substring(3,5));
        // System.out.println(s3.length());
        // System.out.println(s3.charAt(4));
        // String s5=s1+" "+s3+ 10+12+20;
        // String s6= s1.concat(s3).concat(s2).concat(s5);
        // System.out.println(s5);
        // System.out.println(s6);
        // System.out.println(s5.toLowerCase());
        // System.out.println(s6.toUpperCase());
        System.out.println(firstOcc("krishna", 3));
    }

    //Create a func to reverse a string
    static int compare(String s1, String s2){
        if(s1==s2) return 0;
        for(int i=0;i<s1.length();i++)
            if(s1.charAt(i)!=s2.charAt(i))
                return s1.charAt(i)-s2.charAt(i);
        return s1.length()-s2.length();
    }

    static String firstOcc(String s, int k){
        String ans= s.substring(0,k);
        int i=1;
        k++;
        while(k<=s.length()){
            String temp= s.substring(i,k);
            if(compare(ans, temp)>0){
                ans=temp;
            }     
            i++;k++;       
        }
        return ans;
    }

    //Ques : 424
}
