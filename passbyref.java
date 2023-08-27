public class passbyref {
    int length;
    int breadth;
    int height;
    passbyref(int l,int b,int h)
 {
    length=l;
    height=h;
    breadth=b;
 }



 passbyref doubleobj(){
    passbyref temp=new passbyref(2*length,2*breadth,2*height);
    return temp;
 }


 boolean isEqual(passbyref m){//pass by reference because no new is used
    //m.length++;
    if(length==m.length&&breadth==m.breadth&&height==m.height)
    return true;
    return false;
   }
  public static void main(String[] args) {
    passbyref s=new passbyref(5,3,6);


    passbyref s1=new passbyref(5,3,6);
    System.out.println(s.isEqual(s1));
    //System.out.println(s1.length);
    passbyref b=s1.doubleobj();//i want this obj that double size of s1
    
   System.out.println(b.length);
   System.out.println(b.breadth);
   System.out.println(b.height);
  }
}
