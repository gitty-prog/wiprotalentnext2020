1.Integer
public class One{
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		String str = sc.nextLine();
		try {
			int x = Integer.parseInt(str);
			System.out.println("The square value is: " + x * x);
			System.out.println("The work has been done successfully");
		} catch (NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer.");
			//e.printStackTrace();
		}
		sc.close();
}
}
2.Array
public class Two {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();
int[] arr = new int[n];
		System.out.println("Enter the elements in the array: ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter the index of the array element you want to access");
		int index = sc.nextInt();
		try {
			System.out.println("The array element at index " + index + " = " + arr[index]);
			System.out.println("The array element successfully accessed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
sc.close();
	}
}
3.Arrays
import java.util.InputMismatchException;
import java.util.Scanner;
public class Three{
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the arrays");
		int n = sc.nextInt();
                      int[] arr = new int[n];
		System.out.println("Enter the elements in the array: ");
		try {
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
		System.out.println("Enter the index of the array element you want to access");
                                int index = sc.nextInt();
			System.out.println("The array element at index " + index + " = " + arr[index]);
			System.out.println("The array element successfully accessed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}
sc.close();
}
}
4.
import java.util.InputMismatchException;
public class Four {
public static void main(String[] args) {
		int n = args.length;
		for (int i = 0; i < n; i++)
			if (args[i].charAt(args[i].length() - 1) == ',') 
				args[i] = args[i].replace(",", "");
		//System.out.println(Arrays.toString(args));
		int[] arr = new int[n];
                           int sum = 0;
		double avg = 0;
		try {
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(args[i]);
			for (int i = 0; i < n; i++)
				sum += arr[i];
			            avg = sum / n;
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
}
}
5.
import java.util.Scanner;
public class Five {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			double r = division(a, b);
			System.out.println(r);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
	public static double division(int a, int b) throws ArithmeticException {
		return a / b;
	}
}
6.
port java.util.Scanner;
public class Six {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			String name = "";
			int subA = 0;
			int subB = 0;
			int subC = 0;
			try {				
				name = sc.nextLine();
				if (sc.hasNextInt())
					subA = sc.nextInt();
else
      throw new NumberFormatException();
				if (sc.hasNextInt())
					subB = sc.nextInt();
				else
					throw new NumberFormatException();
				if (sc.hasNextInt())
					subC = sc.nextInt();
				else
					throw new NumberFormatException();
				if (subA < 0) throw new NegativeValuesException();
				if (subA > 100) throw new ValuesOutOfRangeException();
				if (subB < 0) throw new NegativeValuesException();
				if (subB > 100) throw new ValuesOutOfRangeException();
				if (subC < 0) throw new NegativeValuesException();
				if (subC > 100) throw new ValuesOutOfRangeException();
				} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (NegativeValuesException e) {
				System.out.println(e.getMessage());
			} catch (ValuesOutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Name: " + name);
			System.out.println("Marks of subject A: " + subA);
			System.out.println("Marks of subject B: " + subB);
			System.out.println("Marks of subject C: " + subC);
		}
		sc.close();
}
}
 NegativeValuesException.java:
public class NegativeValuesException extends Exception {
	public NegativeValuesException() {
		super();
		System.out.println("NegativeValuesException occured");
	}
}
ValuesOutOfRangeException.java:
public class ValuesOutOfRangeException extends Exception {
	public ValuesOutOfRangeException() {
		super();
		System.out.println("ValuesOutOfRangeException occured");
	}
}
7.
public class InvalidCountryException extends Exception {
	public InvalidCountryException() {
		super();
		System.out.println("InvalidCountryException occured");
		System.out.println("User Outside India  cannot be registered");
	}
}
User Registration.java:
public class UserRegistration {
public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserRegistration registration = new UserRegistration();
		try {
			registration.registerUser("Mickey", "US");
			//registration.registerUser("Mini", "India");
		} catch (InvalidCountryException e) {
			//System.out.println(e.getMessage());
		}
}
}
8.
public class Eight {
public static void main(String[] args) throws InvalidAgeException {
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		if (age < 18 || age >= 60)
			throw new InvalidAgeException();
		System.out.println("Name: " + name + " Age: " + age);
	}
public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super();
		System.out.println("Invalid age");
	}
 9.
import java.util.Scanner;
public class Nine {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the 2 numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int quotient = a / b;
			System.out.println("The quotient of " + a + " / " + b + " = " + quotient);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage() + " caught");
		} finally {
			System.out.println("Inside finally block");
		}
sc.close();
	}
}
			



