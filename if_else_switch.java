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

    public static class switch_class {
        public static void main(String args[]){
            System.out.println("Welcome java");
            Scanner scanner = new Scanner(System.in);
            int a,b;
            System.out.println("please enter your first number ");
            a = scanner.nextInt();
            System.out.println("Please enter your second number ");
            b = scanner.nextInt();
            System.out.println("please enter your operator + , - *, / %");
            char operator = scanner.next().charAt(0);
            switch(operator){
                case '+' :
                    System.out.println(a+b);
                    break;
                case '-' :
                    System.out.println(a-b);
                    break;
                case '*' :
                    System.out.println(a*b);
                    break;
                case '/' :
                    System.out.println(a/b);
                    break;
                case '%' :
                    System.out.println(a%b);
                    break;
                default :
                    System.out.println("You have typed wrong num ");

            }

        }
    }
}