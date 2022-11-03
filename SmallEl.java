import java.util.Scanner;
public class SmallEl{

  public static void main(String args[])
  {
    int n,small=0;
    System.out.print("Enter the number of elements: ");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    System.out.print("Enter the elements: "); 
    
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]= sc.nextInt();
    }
    
    small=arr[0];
     for(int i=0;i<n;i++)
    {
      if(small>arr[i])
      {
        small=arr[i];
      }
    }
    
    System.out.print("The smallest element is : "+small+"   "); 
  }
  
}
