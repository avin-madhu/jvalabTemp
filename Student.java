import java.util.Scanner;
public class Student
{

   
    String name;
    int rollNum=0;
    int mark[]= new int[5];
  void read()
    {
      System.out.print("Enter the student Name: ");
      Scanner sc = new Scanner(System.in);
      name =  sc.nextLine();
      System.out.print("Enter the student roll Num: ");
      rollNum = sc.nextInt();
      System.out.print("Enter the Marks of 5 Subjects: ");
      for(int i=0;i<5;i++)
      {
        mark[i] = sc.nextInt();
      }
    }
    
     void display()
    {
      System.out.println("Student Name: "+name);
      System.out.println("Student roll Num: "+rollNum);
      System.out.println("Marks of 5 Subjects: ");
      int si;
      for(int i=0;i<5;i++)
      {
        si=i+1;
        System.out.println(si+"."+" "+mark[i]);
      }
    } 
  public static void main(String args[])
  { 
    Student obj = new Student();
    obj.read();
    obj.display();
    
    
  }
}

