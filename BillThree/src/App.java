import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.println("please enter first name:");
        String name1 = s.nextLine();
        System.out.println("please enter second name:");
        String name2 = s.nextLine();
        System.out.println("please enter third name:");
        String name3 = s.nextLine();
        System.out.println("please enter a number:");
        Double total = s.nextDouble();
        Double NewTotal = total / 3;
        NewTotal = Math.ceil(NewTotal);
        System.out.println("Dear " + name3 + ", " + name2 + ", " + name1 + " pay each: " + NewTotal + " shekels");
        s.close();
    }
}
