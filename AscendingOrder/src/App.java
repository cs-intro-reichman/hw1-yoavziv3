import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter the limit:");
        int lim = s.nextInt();
        int num1 = (int) (Math.random() * lim) + 1;
        int num2 = (int) (Math.random() * lim) + 1;
        int num3 = (int) (Math.random() * lim) + 1;
        System.out.println("unsorted list: " + num1+", " + num2 +", " + num3);
        int min = Math.min(num1, num2);
        min = Math.min(min,num3);
        int max = Math.max(num1, num2);
        max = Math.max(max,num3);
        int middle = num1 + num2 + num3 - min - max;
        System.out.println("sorted list: " + min + ", " + middle + ", " + max);
        s.close();
    }
}
