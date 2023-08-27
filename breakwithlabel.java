public class breakwithlabel {
    public static void main(String[] args) {
        outerloop:
        for(int i=1;i<=10;i++){
            innerloop:
          for(int j=1;j<=10;j++){
            if(j==5){
                break innerloop;
            }
            System.out.print(j+"\t");
            
          }
           System.out.println();
        }
       
}
}
