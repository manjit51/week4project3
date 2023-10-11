package week4;

public class project {

	public static void main(String[] args) {
		// create a new int array
		int[] ages = new int[]{3,9,23,64,2,8,28,93};
		
		// find the last index
		int end = ages.length-1;
		
		// print the last index minus the first index
		System.out.println(ages[end]-ages[0]);
		
		//create a blank int array
		int[] ages2 = new int[9];
		
		// find the last index of this array
		int end2 = ages2.length-1;
		
		// print the last value minus the first value
		System.out.println(ages2[end2]-ages2[0]);
		
		int avg = 0;
		
		// in a loop, add the values to a sum for every position in an array
		for(int i = 0; i <= end; i++) {
			avg += ages[i];
		}
		
		// divide by the number of positions
		avg /= ages.length;
		
		// print it
		System.out.println(avg);
		
		
		
		// make a new String array
		String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int avg2 = 0;
		
		// in a loop, add the length of each array value to the avg2
		for(int i = 0; i <= names.length - 1; i++) {
			avg2 += names[i].length();
		}
		
		// find the average
		avg2 /= names.length;
		
		// print it
		System.out.println(avg2);
		
		
		String cat = ""; 
		
		// in a loop, concatanate with a space in between each value of the array
		for(int i = 0; i <=names.length-1; i++) {
			cat += names[i] + " ";
		}
		// print it
		System.out.println(cat);
		
		/* answers to questions starting here
		
		// You can access the last element of an array
		//   by calling for the index that is one less than its length 
		
		//you can access the first element by calling array index 0
		
		*/// answers to questions end here
		
		// create new int array with the length of another array
		int[] nameLengths = new int[names.length];
		
		// load said array with the number of letters in each array index
		for(int i = 0; i <= names.length - 1; i++) {
			nameLengths[i] = names[i].length();
		}
		
		int sum = 0;
		
		// add up all the index slots values
		for(int i = 0; i <= nameLengths.length - 1; i++) {
			sum += nameLengths[i];
		}
		
		// print it
		System.out.println(sum);
		
		// my own process
		System.out.println(multiConcat("derp ", 4));
		
	}
	
	// method for repeating concatenation
	public static String multiConcat(String word, int n) {
		String str = word;
		// if the number of concatenations is 0 or less, return nothing;
		if(n <= 0) {
			return "";
			
			// otherwise if n is greater than 1
		} else if(n > 1) {
			
			// concatenate the given word the requested amount of times
			for(int i = 0; i < n - 1; i++) {
				word += str;
			}
		}
		return word;
	}
	
	// method to return a full name with space a in between
	public static String bigName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}	
	
	// method to add all values in an integer array and check if its value exceeds 100
	public static boolean sumCheck(int[] arr) {
		int check = 0;
		
		// add every index value to the check variable
		for(int i = 0; i <= arr.length - 1; i++) {
			check += arr[i];
		}
		
		// if its greater than 100, return true. otherwise return false
		if(check > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	// method to find the average for a double array
	public static double dubAvg(double[] dub) {
		double avg = 0;
		
		// add all values in array to a double variable
		for(int i = 0; i <= dub.length-1; i++) {
			avg += dub[i];
		}
		
		// divide the sum by the number of index positions
		avg /= dub.length;
		
		// return the result
		return avg;
	}
	
	//method to compare averages of double arrays
	public static boolean twoDubAvg(double[] dub1, double[] dub2) {
		
		// calls dubAvg to speed things up. checks to see if dub1's avg is higher than dub2's average.
		// if so then return true. otherwise return false.
		if(dubAvg(dub1) > dubAvg(dub2)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	// method to check if an imaginary person with buy a drink
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		// if both conditions are true the return true. otherwise return false
		if(isHotOutside && moneyInPocket > 10.5) {
			return true;
		} else {
			return false;
		}
	}
	
	// my own method, as you can see it computes factorials.
	public static int factorial(int x) {
		
		// in accordance with factorial rules, if the base is 0, return 1
		if(x == 0) {
			return 1;
		}
		
		int product = x;
		
		// while the current base is greater than one
		while(x > 1) {
			
			// subtract one from the base, then multiply the current total 
			// product by that and set it equal to the result
			x -= 1;
			product *= x;
		}
		
		//return the result
		return product;
	}
}
