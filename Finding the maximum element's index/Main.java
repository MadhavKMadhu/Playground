import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int i = 0; i<n ; i++){
      list[i] = in.nextInt();
    }
    int max = list[0];
    int idx = 0;
    for(int i = 0; i<n ; i++){
      if(list[i]>max){
        max = list[i];
      	idx = i;}
    }
    System.out.print(idx);
    
  }
}