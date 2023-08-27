//Adding the diagonal element of array both primary and secondary.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int i,j;
        int sum=0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number of rows: ");
            int row= input.nextInt();
            System.out.println("Enter the number of columns: ");
            int col= input.nextInt();
            if(row==col){
                int a[][]=new int[row][col];

                for (i = 0; i<row;i++){
                    for (j = 0; j<col;j++){
                        System.out.println("Enter the values of the index"+"["+i+"]"+"["+j+"]");
                        a[i][j]=input.nextInt();
                    }

                }
                System.out.println("THE VALUES YOU GIVEN IS: ");
                for (i = 0; i<row;i++){
                    for (j = 0; j<col;j++) {
                        System.out.print(a[i][j] + "\t");
                    }
                    System.out.print("\n");
                }

                i=0;
                j=0;

                while(i<row){
                    sum +=a[i][j];
                    i++;
                    j++;
                }
                i=0;
                j=col-1;
                while(i<row)
                {
                    if(i!=j)
                        sum += a[i][j];
                    i++;
                    j--;
                }
                System.out.println("The result after adding both primary and secondary diagonal is "+sum);
            }
            else{
                System.out.println("THE ROWS AND COLUMNS MUST BE EQUAL. ");
            }
        }
        }

    }

    
