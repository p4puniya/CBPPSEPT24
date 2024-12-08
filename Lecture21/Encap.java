package Lecture21;
public class Encap {
    private int a1= 10;
    private int a2= 20;

    //getter
    public int getA1(){
        return a1;
    }
    //setter
    public void setA1(int a){
        if(a>0)
        this.a1= a;
        else
        System.out.println("Age can't be negative   ");
    }
}
