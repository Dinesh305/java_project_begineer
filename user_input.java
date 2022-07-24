import java.util.Scanner;

public class user_input {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the coding");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name ? ");
        String name = scanner.nextLine();
        System.out.println("You have typed " + name);
    }

}