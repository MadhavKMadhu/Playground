import java.util.Scanner;
class Main{
  public static int greatest(int n1, int n2, int n3)
  {
    int max;
    if(n1>n2 && n1>n3)
      max = n1;
    else if(n2>n1 && n2>n3)
      max = n2;
    else
      max = n3;
    return(max);
  }
  
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      System.out.print(greatest(n1,n2,n3));
	}
}