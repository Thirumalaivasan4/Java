import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int a,b;
    char ch;
    System.out.println("Follow the below instruction: ");
    System.out.println("ADDATION: '+'\nSUBRACTION: '-'\nMULTIPLICATION: '*'\nDIVISION: '/'\nMODULUS: '%'");
    System.out.println("Enter the first number: ");
    a=s.nextInt();
    System.out.println("Enter the second number: ");
    b=s.nextInt();
    System.out.println("Enter the operation to be preformed: ");
    ch=s.next().charAt(0);
   
    switch(ch){
        default:
        System.out.println("Invalid option!");
        break;
        case '+':
            System.out.println(a+"+"+b+"="+(a+b));
            break;  
        case '-':
            System.out.println(a+"-"+b+"="+(a-b));
            break;
        case '/':
            System.out.println(a+"/"+b+"="+(float)(a/b));
            break;  
        case '*':
           System.out.println(a+"*"+b+"="+(a*b));
            break;
        case '%':
           System.out.println(a+"%"+b+"="+(a%b));
            break;
       

    }

    }
    
}
