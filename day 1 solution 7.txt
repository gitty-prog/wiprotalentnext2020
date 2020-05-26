7.Write a program to print alternate numbers starting from 0 to 100 i.e. 0 2 4 6 8 10 12 . . . 96 98 100

public class JavaExample {

   public static void main(String args[]) {

	int n = 100;

	System.out.print("Alternate Numbers from 0 to "+n+" are: 0 ");

	for (int i = 1; i <= n; i++) {
	   
	   if (i % 2 == 0) {

		System.out.print(i + " ");
	   }
	}

   }
}

