// &,|,!,
public class bitwisedemo {
    public static void main(String[] args) {
        int b=-16;//2s complement
        System.out.println(b>>>2);
        System.out.println(b<<2);
        System.out.println(b>>2);//32bit
         
        int a = 5;   // Binary: 0000 0000 0000 0000 0000 0000 0000 0101
       System.out.println(~a);  // Binary result: 1111 1111 1111 1111 1111 1111 1111 1010
   // Decimal result: -6 (due to two's complement representation)32bit

    }
}
