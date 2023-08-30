package oop;

import oop.cycle.tricycle;

class cycle{
    void display(){
        System.out.println("This is the cycle");
    }
class tricycle extends cycle{
    
}
}
public class AnoymousDemo {
    public static void main(String[] args) {
        cycle c=new cycle(){// anonymous class
            void display(){
        System.out.println("this is the tricycle");     
    }
        };
        c.display();
        cycle t=new cycle();
        t.display();
    }
}
