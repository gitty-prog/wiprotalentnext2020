Day4 in milestone 1:
A.number is even:

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
B.number is odd:

import java.util.Scanner;
public class OddEven 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        n = s.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("The given number "+n+" is Even ");
        }
        else
        {
            System.out.println("The given number "+n+" is Odd ");
	}
    }
}
C.Return last digit of the given number:
 
import java.util.Scanner;
public class LastDigitNumber {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number, last_digit;
		sc = new Scanner(System.in);
		System.out.print(" Please Enter any Number that you wish : ");
		number = sc.nextInt();			
		last_digit = number % 10;		
		System.out.println("\n The Last Digit of a Given Number " + number + "  =  " + last_digit);
	}
}
D. Return second last digit of given number:
 
public class SecondLastDigit
{
      public static void main(String[] args)
      {
        int i = 123456;
         System.out.print(Math.abs((i%100)/10));
      }
}
E.sum of last digits of two given number: 

import java.io.*;
import  java.util.*;
class TwoNumLastDigit
{

    public int addLastDigits(int input1,int input2){
        int sum=0;
        if((input1<10&&input1>0)&&(input2<10&&input2>0))
            sum=input1+input2;
        else if(input1<0&&input2<0)
        {
            input1=0-input1;
            input2=0-input2;
            input1=input1%10;
            input2=input2%10;
             sum=input1+input2;
        }
        else if(input1<0||input2<0)
        {
            input1=input1%10;
            input2=input2%10;
             sum=input1-input2;
            sum=sum%10;
        }
        else
        {
            while((input1 >10)||(input2 >10))
            {
              input1=input1%10;
              input2=input2%10;
              sum=input1+input2;
            }
        }

        System.out.print(sum);
        return sum;
    }
}
DAY 5 in milestone1: 
  A.Is N an exact multiple of M :

public static boolean IsMultiple(int num1, int num2){
    int remainder = num1 % num2;
    boolean multiple = true;
    if (remainder != 0){
        multiple = false;
    }
    return multiple;
}

B. how many are even?:

import java.io.*; 
class GFG { 
    static void CountingEvenOdd(int arr[],int arrsize) 
    { 
        int evencount = 0;          
        int oddcount = 0;
        for(int i = 0 ; i < arrsize ; i++)  
        { 
            if ((arr[i] & 1) == 1) 
                oddcount ++ ;     
            else                
                evencount ++ ;      
        } 
System.out.println( "Number of even number" + " elements = " + evencount  + " Number of odd elements = " + oddcount) ;      
    }  
    public static void main (String[] args)  
    { 
        int arr[] = {2, 3, 4, 5, 6}; 
        int n = arr.length; 
        CountingEvenOdd(arr, n); 
    } 
}
C.how many are odd?: 
      
import java.util.Scanner;
public class CountOdd {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i, oddCount = 0;
		sc = new Scanner(System.in);
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		int [] a = new int[Size];
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   
		System.out.print("\n List of Odd Numbers in this Array are :");
		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 != 0)
			{
				System.out.print(a[i] + " ");
				oddCount++;
			}
		}
		System.out.println("\n Total Number of Odd Numbers in this Array = " + oddCount);
	}
}
D. how many are Even and odd  in an array?:


import java.util.Scanner;
public class COdd{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i, oddCount = 0;
		sc = new Scanner(System.in)
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		int [] a = new int[Size];		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   
		System.out.print("\n List of Odd Numbers in this Array are :");
		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 != 0)
			{
				System.out.print(a[i] + " ");
				oddCount++;
			}
		}
		System.out.println("\n Total Number of Odd Numbers in this Array = " + oddCount);

	}
}
Day 6 in milestone 1:
A.is prime? 


public class Prime {
    public static void main(String[] args) {
        int num = 29;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
B.Factorial of a number:

 
Public class Factorial{  
 public static void main(String args[]){  
  int i,fact=1;  
  int number=5;    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
} 
C.nth fibonacci:

Public class Fibonacci { 
 static int fib(int n) 
    { 
        if (n <= 1) 
            return n; 
        return fib(n - 1) + fib(n - 2); 
    } 
    public static void main(String args[]) 
    { 
        int n = 9;
        System.out.println(fib(n)); 
    } 
}

D.nth prime 


import java.util.Scanner;
public class PrimeNumber {
  public static void main(String[] args) {
    int num=1, count=0, i;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to find the nth prime number: ");
    int n = sc.nextInt(); 
    while (count < n){
      num=num+1;
      for (i = 2; i <= num; i++){
        if (num % i == 0) {
          break;
        }
      }
      if ( i == num){
        count = count+1;
      }
    }
    System.out.println("Value of nth prime is: " + num);
  }
}
