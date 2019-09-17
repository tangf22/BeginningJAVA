
public class Challenge {
    public static final int size = 4;
    public static void main (String [] args) {
        line();
        top();
        bot();
    }
    public static void line() {
       dash();

    }
    public static void top() {
        for (int line = 1; line <=size; line++)
        {
            System.out.print("|");
            space(line);

            System.out.print("<>");
            for (int dot = 1; dot<=4*line-size; dot++) {
                System.out.print(".");

            }
            System.out.print("<>");
            space (line);
            System.out.println("|");
        }

    }
    public static void bot() {
        for (int line = 1; line <=size; line++)
        {
            System.out.print("|");
            space2(line);

            System.out.print("<>");
            for (int dot = 1; dot<=-4*line+4*size; dot++) {
                System.out.print(".");

            }
            System.out.print("<>");
            space2 (line);
            System.out.println("|");
        }

    }
    public static void space (int line) {
        for (int space = 1; space <= -2 * line + 2 * size; space++) {
            System.out.print(" ");
        }
    }
    public static void space2 (int line) {
        for (int space = 1; space <= 2*line -size/2; space++) {
            System.out.print(" ");
        }
    }
    public static void dash () {
        System.out.print("#");
        for (int dash = 1; dash <= size*4; dash++)
        {
            System.out.print("=");
        }
        System.out.println("#");
    }
}