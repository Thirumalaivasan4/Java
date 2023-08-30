package oop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) throws FileNotFoundException {
        int a=10,b=0;
        int c=0;
int i=0;
        try{
            //int arr[]=null;
            //System.out.println(arr[i]);
             // c=a/b;
           
        }
        catch(ArithmeticException e){
            System.err.println(e);
        }
        catch(NullPointerException e){
            System.err.println(e);
        }
        finally{
            System.out.println("hi");
        }
        /*File file=new File("abc.txt");
       FileInputStream fs=new FileInputStream(file);
      System.out.println("completed");  
     int ia;
      try( Scanner S=new Scanner(System.in);)   {
     ia=S.nextInt();
      }
      System.out.println(ia);*/
  double bal=500,wi=700 ;
  if(bal<wi){
    try {
        throw new InsufficentFundException(wi-bal);
    } catch (InsufficentFundException e) {
        // TODO Auto-generated catch block
        System.out.println("not enough money");
    }
  }
   
    
}
}
