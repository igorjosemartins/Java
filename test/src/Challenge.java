import java.util.Objects;
import java.util.Scanner;

public class Challenge {
    // Complete this function to return either
    // "Hello, [name]!" or "Hello there!"
    // based on the input


    public static String sayHello(String name) {

        Scanner sc = new Scanner(System.in);

        // You can print to STDOUT for debugging if you need to:
        System.out.println("What is your name?");
        String nameInput = sc.nextLine();

        if (Objects.equals(nameInput, name)) {
            System.out.println("Hello," + name + "!");
        } else {
            return System.out.println("Hello there!");
        }
    }
        // but you need to return the correct value in order to pass the challenge

    public static void main (String[]args){
        sayHello("Igor");
    }

}
