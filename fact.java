import java.util.*;
public class fact {
    static int fact1(int n){
         if(n==0){
            return 1;
         }
         return n*fact1(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to find a factorial: ");
        int fa=s.nextInt();
        System.out.println("The factorial of "+fa+" is: "+fact1(fa));
    }

       
}
