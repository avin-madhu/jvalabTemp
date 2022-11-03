import java.util.Scanner;
public class CharSearch{

 public static void main(String args[])
 {
   int flag=0,ind=0;
   System.out.print("Enter the string: ");
   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
  
   System.out.print("Enter the Character to be searched: ");
   char ch = sc.next().charAt(0); 
   
   for(int i=0;i<str.length();i++)
   {
     if(str.charAt(i)==ch)
     {
       flag=1;
       ind = i+1;
     }
     
   }
   if(flag==1)
   {
   System.out.print("The character is present at position "+ind);
   }
   else
   {
   System.out.print("Not Found!!");
   }
  
   
 }

}
