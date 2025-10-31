import java.util.*;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int currentValue;
        int rate;
        int n;
        Scanner s = new Scanner(System.in);

        System.out.println("please enter the amount of money");
        currentValue = s.nextInt();
        System.out.println("please enter the rate");
        rate = s.nextInt();
        System.out.println("please enter the number of years");
        n = s.nextInt();
        double saveRate = (double) rate/100 + 1;
        double saveRateN;

        if(n>1)
        {
            saveRateN = saveRate * saveRate;
        }
        else
        {
            saveRateN = saveRate;
        }
        
        for(int i=1; i<n-1; i++)
        {
            saveRateN = saveRateN * saveRate;
        }
        double futureValue = currentValue * saveRateN;
        System.out.println("after " + n + " years, " + currentValue + "$ saved at " + rate + "% will yield " + (int) futureValue+"$");
    }
}
