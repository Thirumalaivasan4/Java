import java.util.Scanner;

public class star6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char ch=97;
        System.out.println("Enter the number of lines of alphabet print: ");
        int a=s.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+"\t");
                ch++;
                if(ch=='{'){
                    ch=97;
                    continue;
                }
            }
            System.out.println();
        }
    }
}

