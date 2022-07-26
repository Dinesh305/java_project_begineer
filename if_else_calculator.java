import java.util.Scanner;

public class if_else_switch {

    public static void main(String args[]) {
        System.out.println("Welcome java");

        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your num ");
        a = scanner.nextInt();
        System.out.println("please type your num ");
        b = scanner.nextInt();
        System.out.println("please enter your operator");
        char operator = scanner.next().charAt(0);

        if (operator == '+')
        {
            System.out.println(a + b);
        } else if (operator == '-')
        {
            System.out.println(a - b);
        } else if (operator == '*')
        {
            System.out.println(a * b);
        }

        else if (operator == '/')
        {
            System.out.println(a / b);
        }

        else if (operator == '%')
        {
            System.out.println(a % b);

        }


    }
}