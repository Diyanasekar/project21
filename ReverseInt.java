import java.io.*;
import java.util.*;
public class ReverseInt
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int num=0,reversenum=0;
    System.out.println("Eneter the reverse number");
    num=sc.nextInt();
    while(num!=0)
    {
      reversenum=reversenum*10;
      reversenum=reversenum+(num%10);
      num=num/10;
    }
    System.out.println("The reversing number "+reversenum);
  }
}
