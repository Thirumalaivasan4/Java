package busres;

public class Bus {
    private int busno;
    private int cap;
    private boolean ac;
    Bus(int no,boolean ac,int cap){
     this.busno=no;
     this.ac=ac;
     this.cap=cap;
        }

    //all the data should have methods get() and set()
    public int getcapacity(){//accessor method
        return cap;
    }
    public void setcapacity(int a){//mutator
      cap=a;
    }
     public boolean getac(){//accessor method
        return ac;
    }
    public void setac(boolean a){//mutator
      ac=a;
    }
     public int getbusno(){//accessor method
        return busno;
    }
    void displaybusinfo(){
        System.out.println("Bus No: "+busno+"\nAC: "+ac+"\nTotal Capacity: "+cap);
    }
}
