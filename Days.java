import java.io.*;
import java.util.*;
public class Days
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the day");
String s=br.readLine();

switch(s)
{
case"sunday":
System.out.println("False");
break;
case "monday":
case"tuesday":
case"wednesday":
case"thursday":
case"friday":
case"saturday":
System.out.println("True");
break;
default:
	System.out.println("Invalid Input");
}
}
}
