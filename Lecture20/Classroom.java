package Lecture20;

public class Classroom {
        
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
    Instructor inst;
    Students[] students;  //Declaration

    //Constructors
    //Custom Default Constructor
    public Classroom(){
        // System.out.println("A new Classroom is created.");
        inst = new Instructor();
        students= new Students[4];
        for(int i=0;i<students.length;i++)
            students[i]= new Students();
    }
}
