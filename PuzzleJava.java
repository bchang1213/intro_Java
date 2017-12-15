import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class PuzzleJava{
	//Task 1
	public void task1(){
		int[] array = {3,5,1,2,7,9,8,13,25,32};
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		int sum = 0;
		for (int number : array){
			if(number > 10){
				myArray.add(number);
			}
			sum += number;
		}
		System.out.println(sum);
		for (int val : myArray) System.out.println(val);
	}
	//Task 2
	public void task2(){
		// Shuffling the array
		String[] array = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		//Creating a new array to store the array of names, because arrays are immutable.
		ArrayList<String> myArray = new ArrayList<String>();
		
		for(String entry : array) myArray.add(entry);
		//Here we used collections.shuffle to shuffle the new array.
		myArray = Collections.shuffle(myArray);

		//Then we create another new array to store names longer than 5 chars.
		ArrayList<String> longerthanArray = new ArrayList<String>();
		//Print the shuffled names first:
		System.out.println("These are the names shuffled: ");
		for(String name : myArray){
			//If the names are longer than 5 chars, add them to the longerThanArray array.
			if(name.length() > 5){
				longerthanArray.add(name);
			}
			System.out.println(name);
		}
		//Then we print the names longer than 5 chars.
		System.out.println("These names are longer than 5 chars: ");
		for (String name : longerthanArray){
			System.out.println(name);
		}
	}
	//Task 3
	public void task3(){
		//Declare an string containing the alphabet and change it into an array of characters.
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		//Declare an arraylist
		ArrayList<String> myArray = new ArrayList <String>();
		//loop through your array and add each char into the array list.
		for(char c : alphabet){
			myArray.add(c);
		}
		//Shuffle the arraylist
		myArray = Collections.shuffle(myArray);
		//If the arraylist is not null and not empty:
		if (myArray != null && !myArray.isEmpty()) {
			//get the first value in the arraylist
			char firstitem = myArray.get(0);
			//get the last value in the arraylist
  			char lastitem = myArray.get(myArray.size()-1);
		}
		//Print the first and last items.
		System.out.println("Print first and last items: ");
		System.out.println(firstitem);
		System.out.println(lastitem);

		char[] vowels = "aeiou".toCharArray();
		for(char v :vowels){
			if(firstitem == v){
				System.out.println(firstitem + " is a vowel!");
			}
		}
	}
	//Task 4
	public void task4(){
	// Generate and return an array with 10 random numbers between 55-100.
		int[] array = int[10];
		for(int i = 0; i < array.length; i++){
			Random rand = new Random();
			int n = rand.nextInt(45) + 55;
			array[i] = n;
		}
		System.out.println("This is the array of 10 random numbers between 55-100: ");
		for(int number : array){
			System.out.println(number);
		}
	}
	//Task 5
	public void task5(){
	// Generate and return an array with 10 random numbers between 55-100 and have it be sorted
	// (showing the smallest number in the beginning). Display all the numbers in the array.
	// Next, display the minimum value in the array as well as the maximum value.
		int[] array = int[10];
		for(int i = 0; i < array.length; i++){
			Random rand = new Random();
			int n = rand.nextInt(45) + 55;
			array[i] = n;
		}
		ArrayList<String> newArray = new ArrayList<String>();
		for(int number : array) newArray.add(number);
		newArray = Collections.sort(newArray);

		System.out.println("This is the sorted array of random numbers.")
		for(int number : newArray) System.out.println(number);

		System.out.println("This is the min and max number: ");
		//If the arraylist is not null and not empty:
		if (newArray != null && !newArray.isEmpty()) {
			//get the first value in the arraylist
			char firstitem = newArray.get(0);
			//get the last value in the arraylist
  			char lastitem = newArray.get(newArray.size()-1);
		}
		System.out.println("min number: " + firstitem);
		System.out.println("max number: " + lastitem);
	}
	//Task 6
	// Create a random string that is 5 characters long.
	public static String randomStringHelper() {
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		ArrayList<String> listAlphabet = new ArrayList<String>(Arrays.asList(alphabet));

		Random randomGenerator = new Random();
		String randomString = "";

		for(int i = 0; i < 5; i++) {
			randomString = randomString.concat(listAlphabet.get(randomGenerator.nextInt(listAlphabet.size())));
		}

		return randomString;
	}

	public void task6() {
		System.out.println(PuzzlingJava.randomStringHelper());
	}
	//Task 7
	//●Generate an array with 10 random strings that are each 5 characters long
	public ArrayList<String> gen10RandString() {
		ArrayList<String> resultArray = new ArrayList<String>();

		for(int i = 0; i < 10; i++){
			resultArray.add(PuzzlingJava.randomStringHelper());
		}

		return resultArray;
	}
}






















