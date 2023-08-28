package oop;
import java.lang.reflect.*;
public class ReflectionDemo {
    public static void main(String[] args) {
        Employee e=new Employee(254444,"shopiga");
        Class cls =e.getClass();
        System.out.println("THE CLASS NAME IS: "+cls.getName());
       Method[] methods=cls.getMethods();
       for (Method method : methods) {
        System.out.println(method.getName());
       }
       e.getName();
       try {
        System.out.println(methods[0].invoke(e, null));
    } catch (IllegalAccessException e1) {
        
        e1.printStackTrace();
    } catch (InvocationTargetException e1) {
        
        e1.printStackTrace();
    }
       
    }
}
