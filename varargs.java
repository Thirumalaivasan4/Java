public class varargs {
     static int  minValue(int... vals)   {
        int min=Integer.MAX_VALUE;//vals[0]
        for(int x:vals){
            if(x<min)
            min=x;
        }
        return min;
     
    }
    static double  minValue(double... vals)   {
        double min=Double.MAX_VALUE;//vals[0]
        for(double x:vals){
            if(x<min)
            min=x;
        }
        return min;
     
    }
      static char  minValue(char... vals)   {
        char min=127;//vals[0]
        for(char x:vals){
            if(x<min)
            min=x;
        }
        return min;
     
    }
    public static void main(String[] args) {
     int m=minValue(5,2,054);
     System.out.println(m);
    
      int d=minValue(5,32,45,2,0);
     System.out.println(d);
      int e=minValue(5,2,0,4,0,4,9);
     System.out.println(e);
      int f=minValue(5,2,46,54,3,9,15,48,20);//compailer converts into arrAy
     System.out.println(f);
      int v=minValue();
     System.out.println(v);
     double cd=minValue();
    System.out.println(cd); 
       double cd1=minValue(446.5,52.4,54.75);
    System.out.println(cd1);
    char cha1=minValue();
    System.out.println(cha1);
    char cha=minValue('b','a','d');
    System.out.println(cha);

}
}