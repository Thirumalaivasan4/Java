import java.util.Scanner;

public class star5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to be print in pyramid: ");
        int a=s.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
