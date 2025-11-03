// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
        int time = Integer.parseInt(args[0]);
        int mins = time % 100;
        time = time / 100;
        int hours = time;
        String newMin="";
        String newHour="";
        
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
	}
}