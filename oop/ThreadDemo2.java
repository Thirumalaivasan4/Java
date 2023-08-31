package oop;
class Table{
    synchronized void printTable(int n){// create locks.
        for (int i = 1; i <=n; i++) {
             System.out.println(n*i);
             try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
     Table t=new Table();
     Thread t1=new Thread(){
        public void run(){
        t.printTable(5);
        }
     };
     Thread t2=new Thread(){
        public void run(){
        t.printTable(10);
        }
     };
     t1.start();
     t2.start();
    }
}
