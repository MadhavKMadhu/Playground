import java.util.Scanner;
class Main{
  
  //public static search(int arr[],int e1,int e2)
 // {
  //}
  
    
  
  
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int i=0; i<size; i++)
      {
        arr[i] = in.nextInt();
      }
        
      
      int e1 = in.nextInt();
      int e2 = in.nextInt();
      int pos1 = -1, pos2 = -1;
      
      for(int i = 0; i<size; i++)
      {
        if(e1 == arr[i])
          pos1 = i;
        
        
      }
      
      for(int i = 0; i<size; i++)
      {
        if(e2 == arr[i])
          pos2 = i;
        
        
      }
      
      System.out.println(pos1);
      System.out.println(pos2);
      
      
    }
}