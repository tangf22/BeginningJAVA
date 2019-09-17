
/*
Making a star triangle
 */


public class Stars
{
    public static final int COUNT=6;
    public static void main (String [] args)
        {
            for(int line=1; line<=COUNT; line++)
            {
                for(int space = 0; space< -line+COUNT; space++) {
                    System.out.print("");
                }
                for (int counter = 0; counter < line; counter++) {//for is not a statement, use a bracket
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}