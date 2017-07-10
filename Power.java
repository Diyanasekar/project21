import java.io.*;
import java.util.*;
public class Power
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b;
    double c;
    System.out.println("Enter the number");
    a=sc.nextInt();
    System.out.println("Enter the power number");
    b=sc.nextInt();
    c=Math.pow(a,b);
    System.out.println("Answer:"+c);
  }
}
