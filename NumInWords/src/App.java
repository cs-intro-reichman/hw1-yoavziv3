import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int units =0; 
        int tens =0;
        int hundreds =0;
        Scanner s = new Scanner(System.in);
        System.out.println("please enter a number between 100-999");
        int number = s.nextInt();
        while (number < 100 || number > 999)
        {
            System.out.println("please enter a number between 100-999");
            number = s.nextInt();
        }
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
        System.out.println(hundreds + " hundreds, " + tens + " tens, " + units + " units");
    }
}