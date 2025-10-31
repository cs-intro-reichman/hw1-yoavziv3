import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        System.out.println("please enter the time:");
        int time=s.nextInt();
        int mins = time % 100;
        time = time / 100;
        int hours = time;
        String newMin="";
        String newHour="";
        while (mins > 59 || hours > 23) 
        {
            if(mins > 59)
            {
                System.out.println("the minutes should be a number between 0-59");
            }
            if(hours > 23)
            {
                System.out.println("the hours should be a number between 0-23");
            }
            time=s.nextInt();
            mins = time % 100;
            time = time / 100;
            hours = time;
        }
        
        if(hours > 12 && mins >= 10)
        {
            System.out.println(hours-12 + ":" + mins + " PM");
        }
        if(hours == 12 && mins >= 10)
        {
            System.out.println(hours + ":" + mins + " PM");
        }
        if (hours == 12 && mins < 10)
        {
            newMin="0"+Integer.toString(mins);
            System.out.println(hours + ":" + newMin + " PM");
        }
        if (hours > 12 && mins < 10)
        {
            newMin="0"+Integer.toString(mins);
            System.out.println(hours-12 + ":" + newMin + " PM");
        }


        if(hours < 12 && mins >= 10)
        {
            newHour="0"+Integer.toString(hours);
            System.out.println(newHour + ":" + mins + " AM");
        }
        if (hours < 12 && mins < 10)
        {
            newMin="0"+Integer.toString(mins);
            newHour="0"+Integer.toString(hours);
            System.out.println(newHour + ":" + newMin + " AM");
        }
        s.close();
    }
}
