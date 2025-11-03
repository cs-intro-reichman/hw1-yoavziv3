// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
        String time = args[0];
        String [] newTime = time.split(":");
        int hours = Integer.parseInt(newTime[0]);    
        int mins = Integer.parseInt(newTime[1]);  
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


        if(hours < 10 && mins >= 10)
        {
            newHour="0"+Integer.toString(hours);
            System.out.println(newHour + ":" + mins + " AM");
        }
        if (hours < 10 && mins < 10)
        {
            newMin="0"+Integer.toString(mins);
            newHour="0"+Integer.toString(hours);
            System.out.println(newHour + ":" + newMin + " AM");
        }
	}
}
