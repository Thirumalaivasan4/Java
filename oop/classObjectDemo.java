package oop;

public class classObjectDemo {
    public static void main(String[] args) {
        String s1="java";//it stores in the string pool memory this memory used for only the string constant.
        String s2="java";
        String s3=new String("java");//new object is allocated
        String s4=new String("java");
        System.out.println(s1==s2);
        System.out.println(s3==s4);//Here these objects are compairing the memory
        //to compair the content.
        System.out.println(s1.equals(s4));


    }
}
