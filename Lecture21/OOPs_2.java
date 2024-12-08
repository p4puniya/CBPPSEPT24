package Lecture21;

public class OOPs_2 {
    public class Animals{
        String name;
        Animals food;
    }

     Animals root;

    public OOPs_2(){
        root= new Animals();
        this.root.name= "Food Chain";
    }

    public void eats(String A1, String A2){
        Animals a1= new Animals();
        Animals a2= new Animals();
        this.root.food= a1;
        a1.name= A1;
        a2.name= A2;
        a1.food= a2;
    }
}
