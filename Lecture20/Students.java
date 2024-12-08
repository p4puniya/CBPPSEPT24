package Lecture20;

public class Students {
    String name;
    String batch;
    int rollNo;
    float cgpa;

    public Students(){
        this.name= "John Doe";
        this.batch= "None";
        this.rollNo= -1;
        this.cgpa= -1;
    }

    public Students(
        String name,
        String batch,
        int rollNo,
        float cgpa
    ){
        this.name= name;
        this.batch= batch;
        this.rollNo= rollNo;
        this.cgpa= cgpa;
    }
}
