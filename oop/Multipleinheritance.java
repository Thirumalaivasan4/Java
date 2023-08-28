package oop;
class A{
  void Display(){
    System.out.println("From class A");
  }
}
class B extends A{
   void Display(){
    System.out.println("From class B");
  }
}
class C extends B{//class C extends B,A
  void Display(){
    System.out.println("From class C");
  }
}
public class Multipleinheritance {
    public static void main(String[] args) {
       C c=new C();
     c.Display();
    }
}
