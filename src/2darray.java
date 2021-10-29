//begin by importing necessary requirements
import java.util.Random;

public class arrayLab {

	public static void main(String[] args) {
	
		//Lets initialize the beginning variables
		
		//initialize the random object
		Random r = new Random();
		
		//initialize the 3X4 Array
		int[][] myArray = new int[3][4];
		
		//alright, lets start to add random numbers to the array
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j < 4; j++) {
				myArray[i][j] = r.nextInt(100)+1;
			}
		}
		
		//lets test this out by printing the array
		System.out.println("Array: ");
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		System.out.println("Row Sums: ");
		//now lets get the summation of the rows
		
		//started by initializing the starting variables
		int row0Sum = 0;
		int row1Sum = 0;
		int row2Sum = 0;
		//used a for loop to iterate through each row
		for(int i = 0; i < 3; i++) {
			//I used an if statement here to put the sum into the right variable
			if (i == 0) {
				for(int j = 0; j < 4; j++) {
					row0Sum += myArray[i][j];
				} 
			} else if (i == 1) {
				for(int j = 0; j < 4; j++) {
					row1Sum += myArray[i][j];
				} 
			} else {
				for(int j = 0; j < 4; j++) {
					row2Sum += myArray[i][j];
				} 
			}
		}
		
		//here we print out the sums of each rows
		System.out.println("Row 0 Sum: " + row0Sum);
		System.out.println("Row 1 Sum: " + row1Sum);
		System.out.println("Row 2 Sum: " + row2Sum);
		
		System.out.println("---------------------------");
		
		System.out.println("Column Sums: ");
		// finding the sum of the columns will be a very similar process to rows
		//lets begin by initializing the variables
		
		int col0Sum = 0;
		int col1Sum = 0;
		int col2Sum = 0;
		int col3Sum = 0;
		
		//now lets create the for loop that will tally the sums
		// the only difference in this for loop is the swapping of the i and j variable to cycle
		// vertically rather than horizontally in the previous loop
		for (int i = 0; i < 4; i++) {
			if (i == 0) {
				for (int j = 0; j < 3; j++) {
					col0Sum += myArray[j][i];
				}
			} else if (i == 1) {
				for (int j = 0; j < 3; j++) {
					col1Sum += myArray[j][i];
				}
			} else if (i == 2) {
				for (int j = 0; j < 3; j++) {
					col2Sum += myArray[j][i];
				} 
			} else {
				for (int j = 0; j < 3; j++) {
					col3Sum += myArray[j][i];
				} 
			}
		}
			
		//now lets print out the sums 
		System.out.println("Col 0 Sum: " + col0Sum);
		System.out.println("Col 1 Sum: " + col1Sum);
		System.out.println("Col 2 Sum: " + col2Sum);
		System.out.println("Col 3 Sum: " + col3Sum);
		
		System.out.println("---------------------------");
		
		//now lets iterate through to find the min value
		
		//lets begin by initializing our min var
		int min = myArray[0][0];
		//now lets iterate and compare the values to find the min
		for(int i = 0; i<3; i++) {
			for(int j = 0; j < 4; j++) {
				if (myArray[i][j] < min) {
					min = myArray[i][j];
				}
			}
		}
		
		//now lets print the min value
		System.out.println("Min: " + min);
		
		//now lets show the user at what index the min value is
		
		min = myArray[0][0];
		//we also initialize the index var to 0
		// since we are using a table, we must have an x index and y index
		int x = 0;
		int y = 0;
		for(int i = 0; i<3; i++) {
			for(int j = 0; j < 4; j++) {
				if (myArray[i][j] < min) {
					min = myArray[i][j];
					//here we assign the index to the respective variables
					x = i;
					y = j;
				}
			}
		}
		
		// now lets give the index to our user
		
		System.out.println("Min Index - Row: " + x + " " + "Col: " + y);
		
	}

}
