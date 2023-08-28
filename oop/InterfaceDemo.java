package oop;

interface rideable{//all are abstract method and public method
 void ride();
 default void dis0(){
    System.out.println("This is the interface in dis0. ");
 }
 default void dis1(){
    System.out.println("This is the interface in dis1. ");
 }
 default void dis2(){
    System.out.println("This is the interface in dis2. ");
 }
 default void dis3(){
    System.out.println("This is the interface in dis3. ");
 }
 default void dis4(){
    System.out.println("This is the interface in dis4. ");
 }
}
/*abstract class bike implements rideable{
   
}*/
class bike implements rideable{
    public void ride(){
        System.out.println("you are riding a bike. ");
    }
    public void dis0(){
      System.out.println("hi");
    }
}
class car implements rideable{
    public void ride(){
        System.out.println("you are riding a car. ");
    }
}
class Mech{
    void check(rideable C){//car C
         System.out.println("checking..");
         C.ride();
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        
        car ca=new car();
        bike bi=new bike();
        Mech m=new Mech();
        rideable r1=new bike();
        r1.dis0();
        bi.dis0();
        m.check(ca);
        m.check(bi);
        ca.dis0();
        ca.dis1();
        bi.dis2();
        bi.dis3();
        ca.dis4();
    }
}
