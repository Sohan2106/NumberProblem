
import java.util.Scanner;


public class NumberProblem {
	public static void main(String args[]){
		int[] integerArray = new int[3];
		String input = "";
		String[] stringArray = new String[3];
		
		input(input, stringArray, integerArray);
		computation(integerArray);
	}
	
	public static void input(String input, String[] stringArray, int[] integerArray){
		
		Scanner in = new Scanner(System.in);
		input = in.nextLine();
			
		stringArray = input.split(",");
		
		for(int i =0;i <3;i++){
			integerArray[i] = Integer.parseInt(stringArray[i]);
		}
	}
	
	public static void computation(int[] integerArray){
	
		int largest = integerArray[0];
		int smallest = integerArray[0];
		int secondLargest = integerArray[1];
		int secondSmallest = integerArray[1];
		
		if(largest < secondLargest){
			largest += secondLargest;
			secondLargest = largest - secondLargest;
			largest -= secondLargest;
		}
		
		if(smallest > secondSmallest){
			smallest += secondSmallest;
			secondSmallest = smallest - secondSmallest;
			smallest -= secondSmallest;
		}
		
		if(largest < integerArray[2]){
				secondLargest = largest;
				largest = integerArray[2];
		}
		
		else if(secondLargest < integerArray[2]){
				secondLargest = integerArray[2];
		}
		
		if(smallest > integerArray[2]){
				secondSmallest = smallest;
				smallest = integerArray[2];
		}
		
		else if(secondSmallest > integerArray[2]){
				secondSmallest = integerArray[2];
		}
		
		int largeSum = largest + secondLargest;
		int smallSum = smallest + secondSmallest;
		
		int finalValue = largeSum - smallSum;
		
		System.out.println(largeSum + " " + smallSum + " " + finalValue);
	}
}
