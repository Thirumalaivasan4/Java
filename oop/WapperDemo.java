package oop;

public class WapperDemo {
    public static void main(String[] args) {
        int i=10;
    float f;
    //Integer i2=new Integer(10);
    Integer i2=Integer.valueOf(i);//boxing or rapping
    int j=i2.intValue();//unboxing
    Integer i3=20;//Integer.valueOf(20) is done by the  compailer -->autoboxing
    int k=i2;//autounboxing
    int i4=Integer.parseInt("123");
    
    System.out.println(i4);
    }

}
