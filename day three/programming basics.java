Programming Basics:

1.  Write a Program that accepts two Strings as command line arguments and generate the output in a specific way as given below.
public class Alpha
{
 public static void main(String args[])
{
System.out.println(args[0] + “ technologies ”);
  System.out.println(args[1]);
 }
}
2.Write a Program to accept a String as a Command line argument and the program should print a Welcome message.
public class Beta {
public static void main(String[] args) {
		System.out.println("Welcome " + args[0]);
}
}
3.Write a Program to accept two integers through the command line argument and print the sum of the two numbers
public class Addition {
public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a + b;
System.out.printf("The sum of %d and %d is %d", a, b, c);
}
}

