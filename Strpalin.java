import java.util.Scanner;
public class Strpalin{

 public static void main(String args[])
 {
   int flag=0;
   System.out.print("Enter the string: ");
   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
  
   for(int i=0,j=str.length()-1;i<j;i++,j--)
   {
    if(str.charAt(i)!=str.charAt(j))
    {
     flag=1;
    }
   }
   if(flag==1)
   {
     System.out.print("Not a palindrome!");
   }
   else
   {
     System.out.print("Palindrome");
   }
   
 }

}
