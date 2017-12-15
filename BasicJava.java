import java.util.ArrayList;

public class BasicJava{

	public void print255(){
		for(int i=1; i <= 255; i++){
			System.out.println(i);
		}
	}

	public void printOdd(){
		for(int i=1; i <= 255; i++){
			if(i%2 != 0){
				System.out.println(i);
			}
		}
	}

	public void printSum(){
		int sum = 0;
		for(int i=1; i <= 255; i++){
			sum += i;
			System.out.println("New number:" + i + "Sum:" + sum);
		}
	}

	public void iterateArray(int[] myArray){
		for(int eval : myArray){
			System.out.println(eval);
		}
	}

	public void findMax(int[] myArray){
		int max = myArray[0];
		for (int eval : myArray){
			if(eval > max){
				max = eval;
			}
		}
		System.out.println(max);
	}

	public void getAverage(int[] myArray){
		int sum = 0;
		for(int i = 0; i < myArray.length; i++){
			sum += myArray[i];
		}
		int avg = sum / myArray.length;
		System.out.println(avg);
	}

	public void arrayOdd(){
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		for(int i=1; i <= 255; i++){
			if(i%2 != 0){
				myArray.add(i);
			}
		}
		System.out.println(myArray);
	}

	public void greaterY(int[] myArray, int y){
		int amount = 0;
		for(int i = 0; i < myArray.length; i++){
			if(myArray[i] > y){
				amount ++;
			}
		}
		System.out.println(amount);
	}

	public void squareValues(int[] myArray){
		for(int i = 0; i < myArray.length; i++){
			myArray[i] *= myArray[i];
		}
		System.out.println(myArray);
	}

	public void elimNeg(int[] givenarray){
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		for(int i = 0; i < givenarray.length; i++){
			if(givenarray[i] < 0){
				myArray.add(0);
			}
			else{
				myArray.add(givenarray[i]);
			}
		}
		System.out.println(myArray);
	}

	public void maxMinAvg(int[] myArray){
		int max = myArray[0];
		int min = myArray[0];
		double sum = 0;
		for (int eval : myArray){
			if(eval > max){
				max = eval;
			}
			if(eval < min){
				min = eval;
			}
			sum += eval;
		}
		double avg = sum / myArray.length;
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
        System.out.println("Average is: " + avg);
	}

	public void shiftVals(int[] myArray){
		int length = myArray.length - 1;
		for(int i = 0; i < length; i++){
			myArray[i] = myArray[i+1];
		}
		myArray[length] = 0;
		System.out.println(myArray);
	}

}

