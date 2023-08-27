package oop;
//final 
class Employee extends Object


{
    // base class or super class or parent class.
    private double Salary;
    protected String name;



    Employee(double s,String n){
        Salary=s;
        name=n;
    }
    Employee(){
        //dummy constructor to fix the error in the manager class.
        name=" ";
        Salary=0.0;
    }
    
    public String getName() {
        return name;
    }


    public void setName(String name) 
    {
        this.name = name;
    }

    //final
     public double getSalary() {
        return Salary;
    }


    public void setSalary(double salary) {
        Salary = salary;
    }


    void raiseSalary(double salper){
        Salary +=Salary*salper/100;
    }
}





class Manager extends Employee
{
    //derived class or sub class or child class.
    double bonus;
    Manager(String n,double s,double b){
       //name=n; can be accesed only using protected//we can call the method but we can call the constructor directly it is the bestv option.
       //Salary=s;
       super(s,n);
       bonus=b;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getSalary(){// method overiding
        return super.getSalary()+bonus;
    }
}




public class InheritanceDemo {
   public static void main(String[] args) {
    Employee e1=new Employee(35000, "ram");
    e1.raiseSalary(10);
    System.out.println(e1.getSalary());
    Manager m1=new Manager("jhon", 65000, 0.0);
    m1.setBonus(5.0);
    //can't do like this before override.
    System.out.println(m1.getSalary());
    //e1.setBonus();
   Employee e2=new Manager("siva",5000, 0);
   
   
    //   Manager m2 =new Employee();
    Employee[] employees =new Employee[5];
    employees[0]=new Employee(20455,"shankar");
    employees[1]=new Employee(20455,"thiru");
    employees[2]=new Employee(20455,"sharan");
    employees[3]=new Employee(20455,"vishnu");
    employees[4]=m1;
    Manager m2,m3;
    if(employees[2] instanceof Manager)
    m2=(Manager)employees[2];
    if(employees[3] instanceof Manager){
     m3=(Manager)employees[4];
    m3.setBonus(.6);
   }
    for(Employee emp:employees)
        {
            //emp.setBonus();
            System.out.println(emp.getName()+" "+emp.getSalary());

        }
   } 
}
