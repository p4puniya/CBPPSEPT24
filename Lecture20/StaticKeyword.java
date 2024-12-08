package Lecture20;

public class StaticKeyword {
    private int a1= 10;
    protected int a2= 20;
    final int a3= 30;
    public int a4= 40;

    public StaticKeyword(){
        System.out.println(a1);
    }
//polymorphism
    void func(){}
    void func(int a){}
    void func(int a, int b){}

    // Implementation i1= new Implementation();
    // i1.main();
}
