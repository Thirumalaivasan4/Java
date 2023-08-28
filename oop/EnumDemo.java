package oop;
enum Level{
    BEGINNER("B"),INTERMEDIATER("I"),ADVANCED("A");
   private String abbr;
   Level(String a){
    abbr=a;
   }
   String getAbber(){
    return abbr;
   }
}
public class EnumDemo {
    public static void main(String[] args) {
        Level l1=Level.ADVANCED;
        System.out.println(l1);
        System.out.println(l1.getAbber());
        System.out.println(l1.toString());
        System.out.println(l1.ordinal());
    }
}
