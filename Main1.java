import java.util.Scanner;
 
class Student {
  private String name;
  private int age;
  private int phone;
 
 
  public Student(String name, int age, int phone) {
    this.name = name;
    this.age = age;
    this.phone = phone;
  }
 


  public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Phone: " + phone);
   ;
  }
}
 
public class Main1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 
   
    System.out.print("Enter Student id: ");
    String name = scanner.nextLine();
    System.out.print("Enter Student Age: ");
    int age = scanner.nextInt();
    System.out.print("Enter phone number of parent: ");
    double phone = scanner.nextDouble();
 
    Student student = new Student(name, age, phone);
 
 
    student.printDetails();
  }
}
