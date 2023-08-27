package oop;
public class stack {
    private int a[]=new int[9];
    private int tos;
    public stack()
    {   
       tos=-1;//if zero then store the  value
    }
    void push(int item){
    if(tos==a.length)
    System.out.println("Stack is full");
    else {  
    a[++tos]=item;
    }
    }
    int pop(){
        if(tos>=0){
        return a[tos--];
        }
        else{
        System.out.println("Stack is empty");
        return -1;
}

    }
}
