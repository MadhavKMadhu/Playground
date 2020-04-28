import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int i=0; i<n; i++)
    {
      list[i] = in.nextInt();
    }
    int sum = 0;
    int tsum = 0;
    int l = n/3;
    
    for(int i = 0; i<n; i++)
    {
      tsum += list[i];
    }
    for(int i = 0; i<3; i++)
    {
      sum += list[i];
    }
    if(tsum == sum*l)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
  }
}