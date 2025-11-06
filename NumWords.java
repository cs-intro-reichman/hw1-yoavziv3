// Prints a given number using a hundreds, tens, and units notation.

public class NumWords {
	public static void main(String args[]) {
	    int units = 0; 
        int tens = 0;
        int hundreds = 0;
        int number = Integer.parseInt(args[0]);
        boolean isDone = false;
        
        if (number > 0 && number <= 99 && isDone == false)
        {
            units = number % 10;
            tens = number / 10;
            isDone = true;
        }

        if (number < 10 && isDone == false) 
        {
            units = number;
            isDone = true;
        }
        
        if (number >= 100 && isDone == false)
        {
            units = number % 10;
            number = number / 10;
            tens = number % 10;
            hundreds = number / 10;
            isDone = true;
        }
        System.out.println(hundreds + " hundreds, " + tens + " tens, and " + units + " ones.");
	}
}