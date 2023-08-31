package oop;
//problem in clone i want to learn many things
class Department{
  int departid;
   String name;
   Department(int d,String s){
    departid=d;
    name=s;
   }
}




class Student implements Cloneable {
  int id;
  String sname;
  Department department;
  Student(int i,String sname,Department dep){
   this.id=i;
   this.sname=sname;
   this.department=dep;
  }

  
  protected Object clone() throws CloneNotSupportedException{
    return super.clone();
  }
}



public class objectCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
    Department d1=new Department(1,"physics" );
    Student s1=new Student(1, "Thiru", d1);
    Student s2=(Student)s1.clone();
    }
   
}
