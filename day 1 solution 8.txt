8. Write a program to print all numbers backwards from 100 to 0 i.e. 100 99 98 97 96 . . . 4 3 2 1 0

public class WholeRev
{
   public static void main(String args[])
   {
	int i;
	System.out.println(" The Natural Numbers Is In Reverse Order:");
	for(i=100;i>=0;i--)
	 {
		System.out.print(" "+i);
      }
    }
}
