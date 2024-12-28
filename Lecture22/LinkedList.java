package Lecture22;

public class LinkedList {
    class Node{
        int val;
        Node next;
    }
    Node head;
    Node tail;
    int size=0;

    //Add First: O(1)
    public void addFirst(int item){
        Node nn= new Node();
        nn.val= item;
        if(size==0){
            head= nn;
            tail=nn;
        }else{
            nn.next= head;
            head= nn;
        }
        size++;
    }
    //TC: O(1)
    public void addLast(int item){
        Node nn= new Node();
        nn.val= item;

        if(size==0){
            addFirst(item);
        }else{
            tail.next= nn;
            tail=nn;
            size++;
        }
    }

    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("Null");
    }


}
