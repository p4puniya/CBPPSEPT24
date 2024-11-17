package Lecture15;
public class S_Builder{
    public static void main(String[] args) {
        // StringBuilder sb= new StringBuilder("Hi");
        // sb.ensureCapacity(100);
        // sb.append("Cats");
        // sb.append("Cats");
        // sb.append("Cats");
        // sb.append("Cats");
        // sb.append("Cats");
        // sb.insert(2, "DOGS");
        // sb.replace(2, 6, " I love DSA ");
        // sb.delete(0, 5);
        // sb.reverse();
        // System.out.println(sb.length());
        // System.out.println(sb.capacity()); //Default : 16
        // System.out.println(sb.charAt(0));
        String check= "      Coding matlab , Coding Blocks";
        System.out.println(check.trim());
        // System.out.println(reverseString(check));
    }

    static String reverseString(String s){
        s=s.trim();
        String[] s_arr= s.split(" ");
        String ans="";
        for(int i= s_arr.length-1;i>=0;i--)
            ans+=s_arr[i]+" ";
        return ans.trim();
    }
}