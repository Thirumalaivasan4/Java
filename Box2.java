public class Box2 {
    int length;
 int breadth;
 int height;
    boolean isEqual(Box2 m){//passing an object
        length++;
        m.breadth++;
        if(length==m.length&&breadth==m.breadth&&height==m.height)
        return true;
        return false;
       }
       Box2(int l,int b,int h)
 {
    length=l;
    height=h;
    breadth=b;
    
 }
       public static void main(String[] args) {
        Box2 b=new Box2(7,5,8);
        Box2 c=new Box2(7,5,8);
       System.out.println(b.isEqual(c));
       System.out.println(b.length);
       System.out.println(c.breadth);
       }
}
