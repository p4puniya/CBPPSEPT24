package Lecture20;

public class Instructor {
    String name;
    int code;
    String subject;

    //constructor
    public Instructor(){
        this.name= "John Doe";
        this.code= -1;
        this.subject= "Node";
    }
    //Custom Constructor
    public Instructor(String n, String s, int c){
        this.name= n;
        this.code= c;
        this.subject= s;
    }
}
