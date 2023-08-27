import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       System.out.println("Enter the number of stars to be print in single line: ");
       int sta=s.nextInt();
       for(int i=0;i<sta;i++)
{
  
    for(int j=0;j<sta;j++){
      
          System.out.print("*");
    }
      System.out.println();
}
    }
   
}
