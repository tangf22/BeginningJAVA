

public class challenge3 {
    public static final int size = 4;

    public static void main(String[] args) {
        dashes();
        top();
        bottom();

    }


    public static void dashes() {
        System.out.print("+");
        for (int dash = 1; dash <= 9; dash++)
        {
            System.out.print("-");
        }
        System.out.println("+");
    }


    public static void tophalf() {
        for (int line = 1; line <= size; line++)
        {
            System.out.print("|");

           space(line);

            for (int slash = 0; slash <= line- 2; slash++) {
                System.out.print("/");
            }

            System.out.print("*");

            for (int slash = 0; slash <= line - 2; slash++) {
                System.out.print("\\");
            }
            space(line);

            System.out.println("|");


        }
    }
    public static void space(int line)
    {
        for (int space = 1; space <= -line + size+1; space++) {
            System.out.print(" ");
        }
    }
    public static void space2(int line)
    {
        for (int space = 1; space <= line; space++)
        {
            System.out.print(" ");
        }
    }
    public static void bottomhalf()
    {
        for (int line = 1; line <= size; line++)
        {
            System.out.print("|");

            space2(line);

            for (int slash = 0; slash <= -line + size-1; slash++) {
                System.out.print("\\");
            }

            System.out.print("*");

            for (int slash = 0; slash <= -line+size-1; slash++) {
                System.out.print("/");
            }

            space2(line);

            System.out.println("|");
        }

    }
    public static void top()
    {
        tophalf();
        bottomhalf();
        dashes();
    }
    public static void bottom()
    {
        bottomhalf();
        tophalf();
        dashes();
    }
}

