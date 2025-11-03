// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]); //amount of money
        double rate = Integer.parseInt(args[1]); //the rate
        int n = Integer.parseInt(args[2]); //number of years

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
        System.out.println("After " + n + " years, $" + currentValue + " saved at " + rate + "% will yield " + (int) futureValue+"$");
	}
}