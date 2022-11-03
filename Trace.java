import java.util.Scanner;
public class Trace
{
  public static void main(String args[])
  {
    int arr[][] = new int[100][100];
    int sum=0;
    int size;
    
    System.out.print("Enter the size: ");
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    System.out.print("Enter the Elements: ");
    
    for(int i=0;i<size;i++)
    {
      for (int j=0;j<size;j++)
      {
         arr[i][j] = sc.nextInt();
      }
    }
    
     System.out.println("The matrix:  ");
     
    for(int i=0;i<size;i++)
    {
      for (int j=0;j<size;j++)
      {
          System.out.print(" "+arr[i][j]);
      }
      System.out.println();
    }
    
      
      
        
    for(int i=0;i<size;i++)
    {
      for (int j=0;j<size;j++)
      {
          if(i==j)
          {
            sum+=arr[i][j];
          }
      }
    }
      
     System.out.print("The trace is: "+sum);
      
    
  }
}
