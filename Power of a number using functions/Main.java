import java.util.Scanner;
class Main{
  public static double power_of_num(int n, int p)
  {
    double ans = Math.pow(n,p);
    return(ans);
  }
  
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int p = in.nextInt();
      System.out.print(power_of_num(n,p));
	}
}