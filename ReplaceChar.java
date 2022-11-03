import java.util.Scanner;
public class ReplaceChar{

 public static void main(String args[])
 {
   int flag=0,ind=0;
   System.out.print("Enter the string: ");
   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
   String strNew = new String("");
  
   System.out.print("Enter the Character to Replace: ");
   char ch = sc.next().charAt(0); 
   
   System.out.print("Enter the Character to be Replaced: ");
   char chR = sc.next().charAt(0); 
   
   for(int i=0;i<str.length();i++)
   {
     if(str.charAt(i)==ch)
     {
       strNew = str.replace(ch,chR);
     }
     
   }
   System.out.print("The new string: "+strNew);
   
  
   
 }

}
