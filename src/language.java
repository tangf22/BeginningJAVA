import java.util.*;

public class language {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 9");
        int num = input.nextInt();
        System.out.println("Please enter an operation");
        String op = input.next();
        char op2= op.charAt(0);
        System.out.println("Please enter a number between 0 and 9");
        int num2 = input.nextInt();


        String x = numswitch(num);
        String y =numswitch(num2);
        String z =operation(op2);
        int result = 0;
        if (op2=='*')
        {
            result = num*num2;

        }
        if(op2=='/')
        {
            result = num/num2;
        }
        if(op2=='+')
        {
            result = num+num2;
        }
        if(op2=='-')
        {
            result = num-num2;
        }

        System.out.println(x+" "+y+" " +z +" is " + result);

    }

    public static String numswitch(int num) {
        switch (num) {
            case '0':
                String zero = "zero";
                return zero;

            case 1:
                zero = "one";
                return zero;
            case 2:
                zero = "two";
                return zero;
            case 3:
                zero = "three";
                return zero;
            case 4:
                zero = "four";
                return zero;
            case 5:
                zero = "five";
                return zero;
            case 6:
                zero = "six";
                return zero;
            case 7:
                zero = "seven";
                return zero;
            case 8:
                zero = "eight";
                return zero;
            case 9:
                zero = "nine";
                return zero;
        }
        return null;
    }


        public static String operation (char op2)
        {
            switch (op2)
            {
                case'+':
                String operation = "add";
                return operation;
                case'-':
                    operation = "minus";
                    return operation;
                case'*':
                   operation="times";
                    return operation;
                case'/':
                    operation="divided by";
                    return operation;
        }
        return null;


    }

}

