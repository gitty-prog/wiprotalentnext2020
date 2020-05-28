								FLOW CONTROL STATEMENTS

1)POSITIVE,NEGATIVE,ZERO:

import java.util.*;


class Main {
  public static void main(String[] args) {
   
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter number 1:");
    int num1=sc.nextInt();
    
    if(num1>0)
      System.out.println("The number"+num1+"is positive");
    else if(num1<0)
      System.out.println("The number"+num1+"is negative");
    else
      System.out.println("The number"+num1+"is equal to 0");
  }
}

2)EVEN OR ODD:

import java.util.*;
class Main {
  public static void main(String[] args) {
   
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter number 1:");
    int num1=sc.nextInt();
    
    if(num1%2==0)
      System.out.println("The number"+num1+"is even");
    else 
      System.out.println("The number"+num1+"is odd");
    
  }
}

4)INITIALIZE AND DISPLAY CHARACTER IN ALPHABETICAL ORDER:

import java.util.*;
class Main {
  public static void main(String[] args) {
  char ch1,ch2;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter character 1:");
  ch1=sc.next().charAt(0);
  System.out.println("enter character 2:");
  ch2=sc.next().charAt(0);
  if(ch1>ch2)
  {
    System.out.println(ch2+","+ch1);
  }
  else{
   System.out.println(ch1+","+ch2);
  } 
  }
  
  }

5)ALPHABET,DIGIT,SPECIAL CHARACTER:

import java.util.*;
class Main {
  public static void main(String[] args) {
  char ch1;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter character 1:");
  ch1=sc.next().charAt(0);
  if((ch1>='a' && ch1<='z')||(ch1>='A' && ch1<='Z'))
    {
        System.out.print("Entered character"+ ch1 + "is Alphabet");
    }
  else if(ch1>=48 && ch1<=57)
    {
        System.out.print("Entered character"+ ch1 + "isDigit");

    }
    
    else
    {
        System.out.print("Entered character"+ ch1 + "is special character");

    }
  }
  
  }

3) COMMAND LINE ARGUMENT:


import java.util.*;
class Main {
  public static void main(String[] args) {
    
    if(args.length==0)
    {
      System.out.println("no values");
    }
    else{
      for(int i=0;i<=args.length;i++)
    System.out.println(args[i]+" , ");
    }
  }
}

