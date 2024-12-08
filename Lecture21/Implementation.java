package Lecture21;

import Lecture21.OOPs_2.Animals;

public class Implementation {
    public static void main(String[] args) {
        // OOPs_2 obj= new OOPs_2();
        // obj.eats("Lion", "Calf");
        // // obj.eats("Calf", "Grass");
        // Animals temp= obj.root;
        // while(temp!=null){
        //     System.out.println("Name:" + temp.name);
        //     if(temp.food!=null)
        //     System.out.println("Food:" + temp.food.name);
        //     temp= temp.food;
        // }
        Encap en= new Encap();
        // en.a1= 20;
        en.setA1(20);
        System.out.println(en.getA1());
    }
}
