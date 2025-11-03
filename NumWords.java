// Prints a given number using a hundreds, tens, and units notation.

public class NumWords {
	public static void main(String args[]) {
	    int units =0; 
        int tens =0;
        int hundreds =0;
        int number = Integer.parseInt(args[0]);
        while (number > 0)
        {
            if(number > 99 && number <= 999)
            {
                units = number % 10;
            }
            if(number <= 99 && number > 10)
            {
                tens = number % 10;
            }
            if(number > 0 && number < 10)
            {
                hundreds = number % 10;
            }
            number = number / 10;
        }
        System.out.println(hundreds + " hundreds, " + tens + " tens, " + units + " ones");
	}
}
