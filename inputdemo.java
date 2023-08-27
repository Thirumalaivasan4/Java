import java.util.Scanner;

public class inputdemo{
    public static void main(String args[]){
    Scanner ip = new Scanner(System.in);
      int rollno;
       String name1;
       boolean a;
       byte by;
       short sh;
       long ln;
       float fl;
       double db;
       char ch;
       System.out.println("Enter the value for boolean: ");
       a=ip.nextBoolean();
       System.out.println("Enter the value for integer: ");
       rollno=ip.nextInt();
       System.out.println("Enter the value for String: ");
       ip.nextLine();
       name1=ip.nextLine();
        System.out.println("Enter the value for Byte: ");
       by=ip.nextByte();
        System.out.println("Enter the value for long: ");
       ln=ip.nextLong();
       System.out.println("Enter the value for short: ");
       sh=ip.nextShort();
        System.out.println("Enter the value for float: ");
       fl=ip.nextFloat();
       System.out.println("Enter the value for char: ");
       ch=ip.next().charAt(0);
       System.out.println("Enter the value for double: ");
      db=ip.nextDouble();
        System.out.println("byte: "+by);
          System.out.println("short: "+sh);
             System.out.println("integer: "+rollno);
          System.out.println("long: "+ln);
          System.out.println("float: "+fl);
          System.out.println("dobule: "+db);
          System.out.println("char: "+ch);
          System.out.println("boolean: "+a);
        
     System.out.println("fnished");


}
}