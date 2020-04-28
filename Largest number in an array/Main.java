import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      
      for(int i=0; i<size; i++)
      {
        arr[i] = in.nextInt();
      }
      
      int maxi = arr[0];
      for(int i=0; i<size; i++)
      {
        if(maxi<arr[i])
          maxi = arr[i];
        
      }
      System.out.print(maxi);
    }
}