package oop;
class Outer{
  int o;
  void display1(){
    System.out.println("Outer Class.");
  }

 static class In{
  int i;
  void display2(){
    System.out.println("Inner Class.");
  }
}
}
public class InnerDemo {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.o=10;
        outer.display1();
        //Outer.In i=outer.new In();
          Outer.In inner=new Outer.In();
          inner.display2();
    }
}
