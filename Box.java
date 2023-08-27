public class Box {
 int length;
 int breadth;
 int height;
 static int boxcount;
 
 int volume(){
    return length*breadth*height;
 }
 void setDim(int l,int b,int h){
    length=l;
    breadth=b;
    height=h;
    //boxcount++;
 }
 Box(int l,int b,int h)
 {
    length=l;
    height=h;
    breadth=b;
     boxcount++;
 }
 Box(){
    length=-1;
    breadth=-1;
    height=-1;
     boxcount++;
 }
 Box(int val){
   length=breadth=height=val;
    boxcount++;
 }
 Box(Box a){//passing qbj to constructor
 length=a.length;//copy constractor
 breadth=a.breadth;
 height=a.height;
  boxcount++;

 }
  boolean isEqual(Box m){//passing an object
   if(length==m.length&&breadth==m.breadth&&height==m.height)
   return true;
   return false;
  }
  static{
   boxcount=0;
   System.out.println("from the static block! ");
}
static void display(){
   System.out.println("THE BOX COUNT: "+boxcount);//length); meaning less
}
 public static void main(String[] args) {
   System.out.println("from the main!");
    Box bluebox=new Box();
    bluebox.length=15;
    bluebox.height=8;
    bluebox.breadth=5;
    System.out.println("The volume of the bluebox is: "+bluebox.volume());
   System.out.println("brfore creates box object! "); 
 Box blackbox=new Box(15,5,8);
 System.out.println("after creates box object! ");
    //blackbox.length=15;
    //blackbox.height=5;
    //blackbox.breadth=8;
    System.out.println("The volume of blackbox is: "+blackbox.volume());
    Box redbox=new Box(2,4,5);
    redbox.setDim(2,4,8);
    System.out.println("The volume of readbox is: "+redbox.volume());
    Box b0=new Box(5,7,2);
    System.out.println("The volume of b0 is: "+b0.volume());
    //blackbox=null;1
    //redbox=blackbox;2
    new Box(4,7,5);
   Box cube=new Box(5);
    System.out.println("The volume of cube is: "+cube.volume());
    System.out.println(blackbox.isEqual(bluebox));

     /*void protected finalize(){
          
     }*/
     Box s=new Box(blackbox);
     System.out.println("The volume od s box is similar to the volume of the blackbox: "+s.volume());
   System.out.println(Box.boxcount);
   Box.display();
 }   
}
