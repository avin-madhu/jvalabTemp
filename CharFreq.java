import java.util.Scanner;
public class CharFreq{

 public static void main(String args[])
 {
   int count=0;
   System.out.print("Enter the string: ");
   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
  
   System.out.print("Enter the Character to be counted: ");
   char ch = sc.next().charAt(0); 
   
   for(int i=0;i<str.length();i++)
   {
     if(str.charAt(i)==ch)
     {
       count++;
     }
     
   }
   System.out.print(ch+" occurs "+count+" times"); 
 }

}
