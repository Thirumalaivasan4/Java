package busres;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
    int Busno;
    String passengername;
    Date date;
    //ArrayList<Booking> book=new ArrayList<Booking>();
    Booking(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name of the Pasanger: ");
        passengername=s.nextLine();
        System.out.println("Enter bus no: ");
        Busno=s.nextInt();
        s.nextLine();
        System.out.println("Enter the date dd-mm-yyyy: ");
        String dateip=s.nextLine();
        SimpleDateFormat dateform=new SimpleDateFormat("dd-MM-yyyy");
        try{
        date=dateform.parse(dateip);
        }
        catch(ParseException e){
            e.printStackTrace();
        }

        }
        public boolean bookisAvaliable(ArrayList<Booking> bookings,ArrayList<Bus> buses){
            int cap=0;
            int booked=0;
            for(Bus bus:buses){
               if(bus.getbusno()==Busno){
                   cap=bus.getcapacity();

               }
                 
               for(Booking b:bookings){
                if((b.Busno==Busno )&&(b.date.equals(date))){
                  booked++;
                }

               }
            }
          return booked<cap?true:false;
        }
}
