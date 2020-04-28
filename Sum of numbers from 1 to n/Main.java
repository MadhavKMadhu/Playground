import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = 0;
      sum = (n*(n+1))/2;
      System.out.print(sum);
	}
}