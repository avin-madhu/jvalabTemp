import java.util.Scanner;
public class Array{

  public static void main(String args[])
  {
    int n,sum=0;
    System.out.print("Enter the number of elements: ");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    System.out.print("Enter the elements: "); 
    
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]= sc.nextInt();
    }
    
     for(int i=0;i<n;i++)
    {
      sum=sum+arr[i];
    }
    
    System.out.print("The sum is : "+sum+"   "); 
  }
  
}
