public class passbyvalue {
    static void inc(int a){
    a++;
    }
    
public static void main(String[] args) {
    int a=5;
    inc(a);
    System.out.println("The value is: "+a);
}
    
}
