DAY 8:
Day 7 in Mettl:
1.number of primes in specified range:
public class NoOfPrimesInRange {
	public static int getNoOfPrimesInRange(int input1, int input2) {
		int primeCount = 0;
		int number = input1;
		while(true) {
			boolean isPrime = true;
			for (int i = 2; i < number; i++) {
				if (number % i == 0) isPrime = false;
			}
			if (isPrime) {
				System.out.println("Number: " + number);
				if (number > 1) primeCount++;
			}
			number++;
			if (number > input2) break;
		}
		return primeCount;
	}
}
2.all digits count
public class AllDigitsCount {
	public static int getDigitCount(int input1) {
return String.valueOf(input1).length();
	}
}
3.unique digits count :
public class UniqueDigitsCount {
	public static int getUniqueDigitsCount(int input1) {
		int number = input1;
		int digitCount = 0;
	boolean[] uniqueness = {false, false, false, false, false, false, false, false, false, false};
		
		while (number != 0) {
			int digit = number % 10;
			if (uniqueness[digit] == false) {
				uniqueness[digit] = true;
				digitCount++;
			}
			number /= 10;
		}
		return digitCount;
	}
}
4.non repeated digits count:
public class NonRepeatedDigitsCount {
	public static int getNonRepeatedDigitsCount(int input1) {
		int number = input1;
		int digitCount = 0; 
		int[] repeateness = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		while (number != 0) {
			int digit = number % 10;
			repeateness[digit]++;
			number /= 10;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(repeateness[i] + ", ");
			if (repeateness[i] == 1) digitCount++;
		}
		return digitCount;
	}
}
Day 8 in mettl
1.sum of all Digits in N:
 public class DigitSum {
	public static int getDigitSum (int input1) {
		int sum = 0;
		int digitCount = String.valueOf(input1).length();
		int number = input1;
		if (input1 < 0) number *= -1;
		if (digitCount == 1) sum = number;
		while (digitCount != 1) {
			sum = getSumOfDigits(input1);
			int currentSum = 0;
			while (number != 0) {
				currentSum += number % 10;
				number /= 10;
			}
			sum = currentSum;
			digitCount = String.valueOf(sum).length();
			number = sum;
		    //System.out.println(input1);
		}
		if (input1 < 0) sum *= -1;
		return sum;
	}
	
	static int getSumOfDigits(int no) {
		int sum = 0;
		while (no != 0) {
			sum += no % 10;
		no /= 10;
		}
	return sum;
	}
	public static void main(String[] args) {
		//System.out.println(DigitSum.getDigitSum(8));
		for (int i = 101; i < 110; i++) {
			System.out.println(DigitSum.getDigitSum(i));
		}
	}
}
2.sum of even digits in N:
public class EvenDigitsSum {
	public static int getEvenDigitsSum(int input1) {
	    int sum = 0;
		while (input1 != 0) {
			int digit = input1 % 10;
			if (digit % 2 == 0) sum += digit;
			input1 /= 10;
		}
		
		return sum;
	}
}
3.sum of odd digits in N:
public class OddDigitsSum {
	public static int getOddDigitsSum(int input1) {
	    int sum = 0;
		while (input1 != 0) {
			int digit = input1 % 10;
			if (digit % 2 == 1) sum += digit;
			input1 /= 10;
		}
		return sum;
	}
}
4.sum of even and odd digits :
public class EvenOddDigitsSum {
	public static int getEvenOddDigitsSum(int input1, String input2) {
		int evenSum = 0;
		int oddSum = 0;
		while (input1 != 0) {
			int digit = input1 % 10;
			if (input2.equals("even") && digit % 2 == 0) evenSum += digit;
			if (input2.equals("odd") && digit % 2 == 1)	oddSum += digit;
			input1 /= 10;
		}	
		if (input2.equals("even")) return evenSum;
		else return oddSum;
	}
}
Day 9 in mettl:
1.palindrome :
public class PalindromeNumber {
	public static int getPalindromeNumber (int input1) {
		String numberStr = String.valueOf(input1);
		int digitCount = numberStr.length();
		boolean isPalindrome = true;
		int range = digitCount / 2;
		if (digitCount % 2 == 0) range--;
		for (int i = 0; i <= range; i++) {
		if (numberStr.charAt(i) != numberStr.charAt(digitCount - i - 1))     isPalindrome = false;
		}
		if (isPalindrome == true) return 2;
		else return 1;
	}
}
2.palindrome possible:

public class PalindromePossible {
	public static void main(String[] args) {
		int input1 = 1234;//-21251;
		if (input1 < 0) input1 *= -1;
		StringBuilder numberStr = new StringBuilder(String.valueOf(input1));
		int digitCount = numberStr.length();
		boolean isAnyCombinationPalindrome = false;
		if (input1 < 10) isAnyCombinationPalindrome = true;
		int x = 0;
		int range = digitCount / 2;
		if (digitCount % 2 == 0) range--;
		for (int g = 0; g < digitCount && input1 >= 10; g++) {
			for (int h = 1; h < digitCount; h++) {
				char temp = numberStr.charAt(g);
				numberStr.setCharAt(g, numberStr.charAt(h));
				numberStr.setCharAt(h, temp);
				System.out.print(numberStr.toString() + " :: \n");
				for (int i = 0; i < digitCount; i++) {			
					for (int j = 0; j < digitCount - 1; j++) {
				StringBuilder currentNumberStr = new StringBuilder(numberStr);	
					if (i == j) continue;
						System.out.print(numberStr.toString() + " :: ");
						temp = numberStr.charAt(j);
						numberStr.setCharAt(j, numberStr.charAt(j+1));
						numberStr.setCharAt(j+1, temp);
						
				boolean isCurrentPalindrome = true;
				for (int k = 0; k <= range; k++) {
		if (numberStr.charAt(k) != numberStr.charAt(digitCount - k - 1)) {
		isCurrentPalindrome = false;
		break;
		}
	 }		
		if (isCurrentPalindrome) isAnyCombinationPalindrome = true;
		x++;
		System.out.print("i: " + i + " j: " + j + " :: " + currentNumberStr.toString() + "\n");
					}
				}
			}
		}
		if (isAnyCombinationPalindrome == true) return 2;
		else return 1;
		System.out.println(isAnyCombinationPalindrome);
		System.out.println(x);
	}
}
3.create pin using alpha,beta,gamma:
public class PinGenerator {
	public static int getPin(int input1, int input2, int input3) {
	//Pin positions: 3210		
		int pin = 0;
		//setting 0th position
		int ip1 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(2)));
		int ip2 = Integer.parseInt(String.valueOf(String.valueOf(input2).charAt(2)));
		int ip3 = Integer.parseInt(String.valueOf(String.valueOf(input3).charAt(2)));
		if (ip1 < ip2 && ip1 < ip3) {
			pin = ip1;
		} else if (ip2 < ip3) {
			pin = ip2;
		} else {
			pin = ip3;
		}
	       //setting 1st position
		ip1 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(1)));
		ip2 = Integer.parseInt(String.valueOf(String.valueOf(input2).charAt(1)));
		ip3 = Integer.parseInt(String.valueOf(String.valueOf(input3).charAt(1)));
		if (ip1 < ip2 && ip1 < ip3) {
			pin = ip1 * 10 + pin;
		} else if (ip2 < ip3) {
			pin = ip2 * 10 + pin;
		} else {
			pin = ip3 * 10 + pin;
		}
		
		// setting 2nd position
		ip1 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(0)));
		ip2 = Integer.parseInt(String.valueOf(String.valueOf(input2).charAt(0)));
		ip3 = Integer.parseInt(String.valueOf(String.valueOf(input3).charAt(0)));
		if (ip1 < ip2 && ip1 < ip3) {
			pin = ip1 * 100 + pin;
		} else if (ip2 < ip3) {
			pin = ip2 * 100 + pin;
		} else {
			pin = ip3 * 100 + pin;
		}
		 //setting 3th position
		int maxOfAll = 0;
		for (int i = 0; i < 3; i++) {
			ip1 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(i)));
			ip2 = Integer.parseInt(String.valueOf(String.valueOf(input2).charAt(i)));
			ip3 = Integer.parseInt(String.valueOf(String.valueOf(input3).charAt(i)));
			System.out.println("ip1: " + ip1 + ", ip2: " + ip2 + ", ip3:" + ip3);
			if (ip1 > ip2 && ip1 > ip3) {
				maxOfAll = ip1 > maxOfAll ? ip1 : maxOfAll;
			} else if (ip2 > ip3) {
				maxOfAll = ip2 > maxOfAll ? ip2 : maxOfAll;
			} else {
				maxOfAll = ip3 > maxOfAll ? ip3 : maxOfAll;
			}
			System.out.println("maxOfAll: " + maxOfAll + "\n");
		}
		pin = maxOfAll * 1000 + pin;
		System.out.println(maxOfAll);
		return pin;
	}
	public static void main(String[] args) {
		System.out.println(getPin(123, 582, 175));
	}
}
4.weight of a hill pattern:
public class WeightHillPattern {
	public static int getWeightHillPattern(int input1, int input2, int input3) {
		int totalWeight = 0;
		int initWeight = input2;
		for (int i = 0; i < input1; i++) {
			for (int j = 0; j <= i; j++) {
				totalWeight += initWeight;
				System.out.println("initWeight: " + initWeight);
			}
			initWeight += input3;
		}
		return totalWeight;
	}
	public static void main(String[] args) {
		System.out.println(getWeightHillPattern(5, 10, 2));
	}
}
Day 10 in mettl:
1.second word in upper case:
public class SecondWordInUppercase {
	public static String getSecondWordInUppercase(String input1) {
		if (input1.equals("")) return "LESS";
		StringBuffer sb = new StringBuffer(input1.trim()){
		try {
			int startIndex = sb.indexOf(" ");
			if (startIndex == -1) return "LESS";
			try {
				int endIndex = sb.indexOf(" ", startIndex+1) + 1;
				return sb.substring(startIndex+1, endIndex).toUpperCase().trim();
			} catch (StringIndexOutOfBoundsException e) {
				//System.out.println(e.getMessage());
				return sb.substring(startIndex+1).toUpperCase().trim();
			}
		} catch (StringIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
			return "LESS";
		}
	}
	public static void main(String[] args) {
		System.out.println(getSecondWordInUppercase("hello"));
	}
}
2.is palindrome (string)
public class isPalindromeString {
	public static int getIsPalindromeString(String input1) {
		input1 = input1.toLowerCase();
		int digitCount = input1.length();
		boolean isPalindrome = true;
		int range = digitCount / 2;
		if (digitCount % 2 == 0) range--;
		for (int i = 0; i <= range; i++) {
			if (input1.charAt(i) != input1.charAt(digitCount - i - 1)) isPalindrome = false;
		}	
		if (isPalindrome == true) return 2;
		else return 1;
	}
	public static void main(String[] args) {
		System.out.println(getIsPalindromeString("madam"));
	}
}
3.weight of string:
public class WeightOfString {
	public static int getWeightOfString(String input1, int input2) {
		int weight = 0;
		
		A=65, Z=90; a=97, z=122
		System.out.printf("%c\n", 122);
		for (int i = 0; i < input1.length(); i++) {
			char letter = input1.charAt(i);
			if (input2 == 0) {
				if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || 
					letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
					continue;
				}
			}
			if (letter >= 65 && letter <= 90) { // A-Z
				weight += letter - 64;
				System.out.printf(Integer.toString(letter - 64) + " ");
			} else if (letter >= 97 && letter <= 122) { // a-z
				weight += letter - 96;
				System.out.printf(Integer.toString(letter - 96) + " ");
			} 
		}
		return weight;
	}
	public static void main(String[] args) {
		System.out.println(getWeightOfString("Hello World!!", 0));
		System.out.println(getWeightOfString("abcdefghijklmnopqrstuvwxyz", 1));
	}
}
4.most frequent digit:
public class MostFrequentDigit {
	public static int getMostFrequestDigit(int input1, int input2, int input3, int input4) {
		String allNo = String.valueOf(input1) + String.valueOf(input2) + String.valueOf(input3) + String.valueOf(input4);
		int[] digitFrequency = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // 0-9
		for (int i = 0; i < allNo.length(); i++) {
			digitFrequency[Integer.parseInt(String.valueOf(allNo.charAt(i)))]++;
		}
		int mostFrequentDigit = 0;
		for (int i = 0; i <= 9; i++) {
		mostFrequentDigit = digitFrequency[i] >= digitFrequency[mostFrequentDigit] ? i : mostFrequentDigit;
		}	
		return mostFrequentDigit;
	}
	public static void main(String[] args) {
		System.out.println(getMostFrequestDigit(123, 456, 345, 5043));

	}
}
