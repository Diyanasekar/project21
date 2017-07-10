import java.io.*;
import java.util.*;
public class Reverse
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str="Hello";
    char [] a=str.toCharArray();
    for(int i=a.length-1;i>=0;i--)
    {
      System.out.println(a[i]);
    }
  }
}
