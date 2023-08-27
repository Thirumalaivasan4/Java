package oop;
abstract class Member{
   private String name;
   abstract void Welecomemsg();//if it is not present then this line gives error. for (Member member : m) {member.Welecomemsg();//easy acesses}
   public String getName(){//concrete method.
  return name;
   }
}
class Student extends Member{
   void Welecomemsg(){
    System.out.println("Hello Student.");
   }
}
class Teacher extends Member{
    void Welecomemsg(){
    System.out.println("Hello teacher..");
   }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.Welecomemsg();
        Teacher t1=new Teacher();
        t1.Welecomemsg();
        //Member m1=new Member();// tell me specific something 
        Member s2=new Student();
        s2.Welecomemsg();
        Member t2=new Teacher();
        t2.Welecomemsg();
        Member[] m=new Member[4];
        m[0]=new Student();
        m[1]=new Student();
        m[2]=new Teacher();
        m[3]=new Teacher();
        for (Member member : m) {
            member.Welecomemsg();//easy acesses
        }
    }
}
