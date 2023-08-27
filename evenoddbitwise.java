import java.util.Scanner;

public class evenoddbitwise {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to check add or even: ");
        int check=s.nextInt();
        if((check&1)==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}
