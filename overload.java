public class overload {
 
        static int max(int a,int b)
        {
            return a<b?b:a;
        }
        static double max(double a,double b){
            return a<b?b:a;
        }
         static char max(char a,char b){
            return a<b?b:a;
        }
        public static void main(String[] args) {
            System.out.println(max(2,3));
             System.out.println(max(5.4,3.1));
              System.out.println(max('4','a'));
        }
   

}

