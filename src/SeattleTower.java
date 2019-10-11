

public class SeattleTower {
    public static final int size = 6;

    public static void main(String[] args) {
        top();
        bottom();

    }

    public static void four() {
        for (int line = 1; line <= size; line++)
        {
            for (int space3 = 1; space3 <= size * 3; space3++)
            {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }
    public static void quote()
    {
        System.out.print("|");
        for (int quotes=1; quotes<=size*3;quotes++)
        {
            System.out.print("''");
        }
        System.out.println("|");
    }

    public static void tophalf() {
        for (int line = 1; line <= size; line++)
        {
            space(line);
            System.out.print("__/");
            for (int colon = 0; colon <= 3 * line - 4; colon++)
            {
                System.out.print(":");
            }

            System.out.print("||");

            for (int colon = 0; colon <= 3 * line - 4; colon++) {
                System.out.print(":");
            }
            System.out.println("\\__");

        }
    }


    public static void space(int line)
    {
        for (int space = 1; space <= -3*line + 3*size; space++)
        {
            System.out.print(" ");
        }

    }


        public static void space2(int line)
        {
            for (int spaces = 1; spaces <= 2 * line - 2; spaces++)
            {
                System.out.print(" ");
            }
        }

        public static void bottomhalf()
        {
            for (int line = 1; line <= size; line++)
            {
                space2(line);
                System.out.print("\\_");

                for (int tri = 1; tri <= -2 * line + 3 * size + 1; tri++)
                {
                    System.out.print("/\\");
                }
                System.out.println("_/");
            }
        }

        public static void support ()
        {
            for (int line = 1; line <= size * 4; line++)
            {
                for (int space = 1; space <= size*3-3; space++)
                {
                    System.out.print(" ");
                }
                System.out.println("|%%||%%|");
            }
        }
        public static void top()
        {
            four();
            tophalf();
            quote();
            bottomhalf();
        }
        public static void bottom()
        {
            four();
            support();
            tophalf();
            quote();
        }

    }
