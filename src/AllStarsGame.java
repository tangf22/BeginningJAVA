import java.util.*;

public class AllStarsGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int hits = input.nextInt();
        System.out.println("Please enter another number");
        int bats = input.nextInt();


        double percent = hits / bats;

        if (percent>0.3)
        {
           System.out.println( "You are eligible for the All Stars Game!");
        }

        else
        {
            System.out.println( "You are not eligible for the All Stars Game");
        }
    }
}