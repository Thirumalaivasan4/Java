import java.util.*;
public class foreach {
    public static void main(String[] args) {
        int ar[]=new int[20];
        Scanner  s=new Scanner(System.in);
        System.out.println("How Many Numbers do you want to sum? ");
        int a=s.nextInt();
        System.out.println("Pleasse enter the number: ");
       for(int i=0;i<a;i++){
        ar[i]=s.nextInt();
       }
        int sum=0;
        for(int x:ar){
          sum=sum+x;
        }
        System.out.println("The sum for elements is: "+sum);
    }
}
