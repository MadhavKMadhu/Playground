import java.util.Scanner;
class Main{
  public static void pushZeros(int arr[], int size)
  {
    int count = 0;
    for(int i = 0; i<size; i++)
    {
      if(arr[i] != 0)
        arr[count++] = arr[i];
    }
    
    while(count<size)
      arr[count++] = 0;
  }
  
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int i =0; i<size; i++)
      {
        arr[i] = in.nextInt();
      }
      pushZeros(arr, size);
      for(int i = 0; i<size; i++)
      {
        System.out.print(arr[i]+ " ");
      }
    }
}