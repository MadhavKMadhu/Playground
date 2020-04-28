import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int l = str.length();
      int alp[] = new int[26];
      for(int i = 0; i<26; i++)
      {
        alp[i] = 0;
      }
      
      for(int i = 0; i<l; i++)
      {
        if(str.charAt(i)>='a' && str.charAt(i)<='z')
        {
          int offset = str.charAt(i) - 'a';
          alp[offset]++;
        }
        else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
        {
          int offset = str.charAt(i) - 'A';
          alp[offset]++;
        }
               
      }
      
      for(int j = 0; j<26; j++)
      {
        if(alp[j] == 0)
        {
          char ch = (char)('a' + j);
          System.out.print(ch+" ");
        }
      }
      
      
      
          
      
    }
}