package busres;

import java.util.*;//nested packages & hierarichal package

public class demo {
    public static void main(String[] args) {

        //ArrayList<Integer> nums=new ArrayList<Integer>();
        //nums.add()
        //Bus buses[]=new Bus[50];//arraylist
        ArrayList<Booking> bookings=new ArrayList<Booking>();
        ArrayList<Bus> buses=new ArrayList<Bus>();
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,true,70));
        buses.add(new Bus(3,false,500));
        Scanner s=new Scanner(System.in);
        System.out.println("The Bus Detials Are: ");
        for (Bus b : buses) {
            b.displaybusinfo();
            }
        int useropt=1;
        while(useropt==1){
        System.out.println("Enter 1 to Book and Press 2 to exit");
        useropt=s.nextInt(); 
        if(useropt==1){
         Booking booking=new Booking();
          if(booking.bookisAvaliable(bookings,buses)){
           bookings.add(booking);
           System.out.println("Your booking is confirmed");
          }
           
           else{
            System.out.println("Sorry! The bus is full   ");
        }
        }
        else{
            System.out.println("Thank you visit again! ");
        }

        
    }
    }
    
}
