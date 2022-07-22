import java.util.Scanner;

public class if_else {
    public static void main (String args[]){
        System.out.println("Welcome java");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name ! ");
        int num;
        num = scanner.nextInt();
        if (num > 0){
            System.out.println("You have typed positive num ");
        }
        else if (num == 0) {
            System.out.println("You have typed neutral no");
        }
        else
        {
            System.out.println("You have typed negative num");
        }

    }
}
