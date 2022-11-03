import java.util.Scanner;
public class AddMat
{
  public static void main(String args[])
  {
    int arr1[][] = new int[100][100];
    int arr2[][] = new int[100][100];
    int sum[][] = new int[100][100];
    int size;
    
    System.out.print("Enter the size: ");
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    System.out.print("Enter the Elements for First matrix: ");
    
    for(int i=0;i<size;i++)
    {
      for (int j=0;j<size;j++)
      {
         arr1[i][j] = sc.nextInt();
      }
    }
    
    System.out.print("Enter the Elements for Second matrix: ");
    
    for(int i=0;i<size;i++)
    {
      for (int j=0;j<size;j++)
      {
         arr2[i][j] = sc.nextInt();
      }
    }
    
    for(int i=0;i<size;i++)
    {
      for (int j=0;j<size;j++)
      {
         sum[i][j]= arr1[i][j]+arr2[i][j];
      }
    }
    
      System.out.println("The sum of the matrix: ");
      
       for(int i=0;i<size;i++)
    {
      for (int j=0;j<size;j++)
      {
         System.out.print(" "+sum[i][j]);
      }
       System.out.println();
      
    }
    
  }
}
