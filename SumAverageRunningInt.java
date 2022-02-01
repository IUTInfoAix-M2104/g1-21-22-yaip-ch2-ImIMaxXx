/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class SumAverageRunningInt {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      final int LOWERBOUND = 111;
      final int UPPERBOUND = 8899;
	  int number = LOWERBOUND;

      // Use a do-while loop to sum from lowerbound to upperbound
      do {
         sum += number; // same as "sum = sum + number"
		 ++number;
      } while (number <= UPPERBOUND);
	  
	  int count = 0;
	  for (count =1 , count < UPPERBOUND);
		  sum += count;
		  ++count;
	  
      // Compute average in double. Beware that int / int produces int!
      average = (double)sum / (double)UPPERBOUND;	
      // Print sum and average
      System.out.println("The sum isb" +sum);
	  System.out.println("The average is " +average);
   }
}