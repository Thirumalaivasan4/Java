
import java.util.*;
public class star7 {
    //Adding the diagonal element of array both primary and secondary.

    public static void main(String[] args) {
        int i,j;
        int sum=0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number of rows: ");
            int row= input.nextInt();
            System.out.println("Enter the number of columns: ");
            int col= input.nextInt();
            if(row==col){

                char a[][]=new char[row][col];

                for (i = 0; i<row;i++){
                    for (j = 0; j<col;j++){
                         a[i][j]='*';
                    }
                }
                System.out.println("Before modifying: ");
                for (i = 0; i<row;i++){
                    for (j = 0; j<col;j++){
                        System.out.print(a[i][j]+"\t");
         
                    }
                    System.out.println();
                }

                System.out.println("After modifying: ");
                i=0;
                j=0;

                while(i<row){
                        if(i==j){
                            System.out.print("\t");
                             
                        }
                        else{
                            System.out.print("*\t");
                        }
                        i++;
                        j++;
                       }
                        i=0;
                        j=col-1;
                        while(i<row)
                        {
                            if(i!=j)
                                System.out.print("\t");
                           
                              System.out.println("*\t");
                            
                             i++;
                            j--;
                        }
                        
         
                    
                    }
                   
                
           
            else{
                System.out.println("THE ROWS AND COLUMNS MUST BE EQUAL. ");
            }
        }
    }}
    

    

