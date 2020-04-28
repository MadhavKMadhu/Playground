import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int first_dig = n,last_dig;
      while(first_dig >= 10)
      {
        first_dig /= 10;
      }
      last_dig = n%10;
      System.out.println(first_dig+last_dig);
	}
}