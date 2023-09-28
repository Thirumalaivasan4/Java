package oop;
class book implements Runnable{

    @Override
    public void run() {
        
    }
    
    
}
class num extends Thread{// interface can also used
   


public void run() {
    for(int i=1;i<=5;i++){
  System.out.println(i);
   try {
    Thread.sleep(100);
} catch (InterruptedException e) {
    e.printStackTrace();
}
    }
    
}
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable b=() ->{

     for(int i=1;i<=5;i++){
        System.out.println("Updating database");
        try {
            Thread.sleep(200);//milli seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }   
        };//now it behaves like thread
       //search for run
       
        num num=new num();
        //b.update();
         Thread t1=new Thread(b);
         t1.setName("book1");
         t1.setPriority(10);//1,5,10
         t1.setPriority(Thread.MAX_PRIORITY);// because it is the static variable
         System.out.println(t1.getName());
         System.out.println(t1.getPriority());// default 5
        t1.start();
        //t1.interrupt();

    
        num.start();
         if(t1.isAlive()){
            System.out.println("Still executing");
        }
        //t1.getId();
        t1.isInterrupted();
        t1.join();//to complete its full procees
        num.join();//to complete its full procees
        //check alive
        if(t1.isAlive()){
            System.out.println("Still executing");
        }
         System.out.println("HELLO");
    }

}
