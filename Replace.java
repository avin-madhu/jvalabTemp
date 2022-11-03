import java.util.Scanner;
public class Replace{

  public static void main(String args[])
  {
    int n,rep,num;
    System.out.print("Enter the number of elements: ");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    System.out.print("Enter the elements: "); 
    
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]= sc.nextInt();
    }
    
    System.out.print("enter the element to be replaced: ");
    rep = sc.nextInt();
    
    System.out.print("enter the element to replace with: ");
    num = sc.nextInt();
    
    System.out.print("the array: ");
     for(int i=0;i<n;i++)
    {
      System.out.print(" "+arr[i]);
    }
    
     for(int i=0;i<n;i++)
    {
      if(arr[i]==rep)
      {
        arr[i]=num;
      }
    }
    
    System.out.print("the new array: "); 
    for(int i=0;i<n;i++)
    {
      System.out.print(" "+arr[i]);
    }
    
  }
  
}
