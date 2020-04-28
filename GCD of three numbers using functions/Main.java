import java.util.Scanner;
public class Main{
  public static int gcd(int n1, int n2, int n3)
  {
    int mini, gcd = 1;
    if(n1<n2 && n1<n3)
      mini = n1;
    else if(n2<n1 && n2<n3)
      mini = n2;
    else
      mini = n3;
    
    while(mini>=1)
    {
      if(n1%mini == 0 && n2%mini == 0 && n3%mini == 0)
      {
        gcd = mini;
        break;
      }
      mini -= 1;
    }
    return(gcd);
  }
  
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      System.out.print(gcd(n1,n2,n3));
    }
}