import java.util.Scanner;
public class SecondLarge{

  public static void main(String args[])
  {
    int n,temp=0;
    System.out.print("Enter the number of elements: ");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    System.out.print("Enter the elements: "); 
    
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]= sc.nextInt();
    }
    
     for(int i=0;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(arr[i]>arr[j])
        {
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    
    
    System.out.print("The Second largest element is : "+arr[n-2]+"   "); // displaying the second last element
  }
  
}
