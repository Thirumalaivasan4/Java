
import java.util.Scanner;

public class star3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=1;
        System.out.println("Enter the number of lines print: ");
        int a=s.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+"\t");
                k++;
            }
            
        }
    }
}
