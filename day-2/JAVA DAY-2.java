// Submitted By: Abnish Rana

public class Employee{
  String name;
  String city;
  int age;
  public void display(){
     System.out.println("The name is "+ name);
     System.out.println("The city is "+ city);
     System.out.println("The age is "+ age);
  }
  public static void main(String[] args){
    Employee ob1=new Employee();
    Employee ob2=new Employee();
    System.out.println("Employee 1");
    ob1.name="Abhi";
    ob1.city="Somewhere on earth";
    ob1.age=20;
    ob2.name="Abnish";
    ob2.city="Nowhere";
    ob2.age=20;
    ob1.display();
    System.out.println("Employee 2");
    ob2.display();
   
  }

}