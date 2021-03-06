package studio8;

// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class CountSteps{
	
	public static void main() throws FileNotFoundException {
		Scanner in = new Scanner (new File("ac.csv"));
		in.useDelimiter(",");
		while(in.hasNext()) {
			System.out.print(in.next());
		}
	}
	
	// File object
	
	 public int numPeaks() {
	 	int i = 1;
		int count = 0;
		int y[] = new int[5]; //change
		int max = y.length; //change
		
		while(i < max-1) {
			if ( (y[i] > y[i-1]) && (y[i] > y[i+1]) ){
				count = count + 1;
				i = i+1;
			}
			else {
				i = i +1;
			}
		}
		return count;
	 }
	
}