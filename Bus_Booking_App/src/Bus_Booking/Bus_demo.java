package src.Bus_Booking;

import java.util.Scanner;

public class Bus_demo {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int user_input =1;
        while(user_input==1){
            System.out.println("Enter your booking options 1 for continue 2 for Exit !");
            user_input=scanner.nextInt();
            if(user_input==1){
                System.out.println("Booking ..........");
            }
        }

    }
}
