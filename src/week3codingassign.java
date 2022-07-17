import java.lang.reflect.Array;

public class week3codingassign {

	public static void main(String[] args) {
		//1a.	Programmatically subtract the value of the first element in the array from the value 
		//      in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		// Add a new age and repeat step above
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 50}; 
			System.out.println( (ages[ages.length - 1]) - ages[0]  );

	// Use a loop to iterate through the array and calculate the average age. Print the result to the console.		
	 double sum = 0;
	 double averageAge = 0;
	for (int x : ages) {
		sum += x;
	
	averageAge = sum / ages.length;
	
	

	System.out.println(averageAge);
	
	}
	//2. Create an array of STring called names that contains the following values: "Sam", "Tommy", "Tim", "Sally", 
	// "Buck", and "Bob".
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	// a. use a loop to iterate through the array and calculate the average number of letters per name. Print results
	
	String listNames = "";
	for (int i = 0; i < names.length; i++) {
		listNames = names[i] + " " + listNames;
		
	}		System.out.println(listNames);
	
	int sumofLetters = 0;
	double averageLetter = 0;
	for (String name : names) {
		sumofLetters += name.length();
		averageLetter = sumofLetters / names.length;
	}	
	
//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces
	// and print the result
	System.out.println(averageLetter);

	//5. Create a new array of int called nameLentgths. WRite a loop to iterate over the previously created names array
	// and add the length of each name to the nameLengths array.
	
	int[] nameLengths = new int[6];
	for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length();
		System.out.println(nameLengths[i]);
		
	
	} int sumofnameLengths = 0;
	for (int number : nameLengths) {
		sumofnameLengths += number;
	
	
	

	
	} System.out.println(sumofnameLengths);
	}
		
	
	//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated 
	// to itself n number of times
	
	public static String words(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
	 
		}return result;
		}
		


	

	//8. Write a method that takes two STrings, firstName and lastName, and returns a full name
public static String greet(String firstName, String lastName) {
	String fullName = firstName + " " + lastName;
	return fullName;
	
}
	
	//9. Write a method that takes an array of int and returns true if the summ of all ints in array is greater
	// than 100
	
public static boolean isSumgreaterthan100(int[] array) {
	int sum = 0;
	for (int number : array) {
		sum += number;
		
	} if (sum < 100) {
	return false;
} else {
	return true;
	
}
}	
	
	//10. Write a method that takes an array of double and returns the average of all elements in array
	
	
public static double calculateAverage(double[] array) {
	double sum = 0;
	for (double number : array) {
		sum += number;
		
	} return sum / array.length;
	 
	}
	
	
	//11. Write a method that takes two arrays of double and returns true i average of elements in first array
	// is greater than the average of elements in the second array
	
public static boolean isFirstArrayGreaterThanSecond(double[] a, double[] b) {
	double firstArray = 0;
	double secondArray = 0;
	
	for (double sum : a) {
	firstArray += sum;
	}
for (double sum : b) {
		secondArray += sum;
	} if (firstArray > secondArray) {
		return true;
	} else {
		return false;
		
	}}

// 12. Write a method called willBuyDrink that takes a boolean IsHotOutside, and a double moneyInPocket
// and returns true if it is hot ouside and if moneyInPocket is greater than 10.50

public static boolean willBuyDrink(boolean IsHotOutside, double moneyInPocket) {
	if (IsHotOutside == true && moneyInPocket > 10.50) {
		return true;
	} else {
	return false;
	
	}}
	
	// 13. Create a method of your own that solves a problem. In comments, write what the method does and
	// why you created it.

public static double averageAgeOfSnrCitizen(double[] array) {
	double sum = 0;
	for (double SnrCitizenAge : array) {
		sum += SnrCitizenAge;
	} return sum / array.length;
	
	// To calculate the age of average senior citizen in a nursing home for statistics.
	}
}