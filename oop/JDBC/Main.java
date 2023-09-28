package oop.JDBC;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("THIS PROGRAM IS FOR INSERTING THE STUDENT INFORMATION");
        System.out.println("Follow the below instruction:");
        System.out.println("1.To display the values");
        System.out.println("2.To insert the values");
        System.out.println("3.To delete the values");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your option: ");
        int a= input.nextInt();
        //while(true) {
            switch (a) {
                case 1:
                    Main.display();
                    break;
                case 2:
                    Main.insert();
                    break;
                case 3:
                    Main.del();
                    break;
                default:
                    System.out.println("please Enter The Correct Option");

            }
       // }
    }
    static void insert() throws Exception
    {

        String path = "jdbc:mysql://localhost:12345/colleges";
        String user = "root";
        String pass = "123456789";
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the student id: ");
        int id= input.nextInt();
        System.out.print("Enter the student name: ");
        String name= input.next();
        System.out.print("Enter the CGP: ");
        Double cgp=input.nextDouble();
        String query = "insert into student values ("+id+","+"'"+name+"'"+","+cgp+");";
        Connection conn = DriverManager.getConnection(path, user, pass);
        Statement st = conn.createStatement();
        int rs = st.executeUpdate(query);
        System.out.println("The number rows affected: "+rs);
        System.out.println("inserted successfully");
        conn.close();

    }
        static void display() throws Exception
        {
            String path="jdbc:mysql://localhost:12345/colleges";
            String user="root";
            String pass="123456789";
            String query="select * from student;";
            Connection conn = DriverManager.getConnection(path, user, pass);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {


                System.out.println("The Sid is:" + rs.getInt(1));
                System.out.println("The name is:" + rs.getString(2));
                System.out.println("The CGP is:" + rs.getDouble(3));
                System.out.print("\n");
            }
            conn.close();
        }
    static void del() throws Exception
    {
        String path="jdbc:mysql://localhost:12345/colleges";
        String user="root";
        String pass="123456789";
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Student_id to delete: ");
        int a= input.nextInt();
        String query="delete from student where sid="+a+";";
        Connection conn = DriverManager.getConnection(path, user, pass);
        Statement st = conn.createStatement();
        int rs = st.executeUpdate(query);
        System.out.println("The number rows affected: "+rs);
        System.out.println("Deleted successfully");
        conn.close();
    }
}





// my sql query

/*create database colleges;
use colleges;
create table books(title varchar(20),isbn int primary key,author varchar(30),edition varchar(20),publi varchar(25));
desc books;
create table student(sid int,sname varchar(20),cgp decimal(5,2));
desc student;
insert into student values(1,'thiru',8.10);
insert into student values(2,'vishnu',8.50);
alter table student modify sid int primary key;
select * from student;
delete from student where sid=3;
drop table student; */
