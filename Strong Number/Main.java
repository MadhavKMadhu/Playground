import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp, rem, sum = 0, i, fact;
      
      for(temp = n; temp > 0;)
      {
        fact = 1;
        rem = temp % 10;
        for(i = 1; i <= rem; i++)
        {
          fact *= i;
        }
        sum += fact;
        temp = temp/10;
      }
      
      if(sum == n)
        System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}