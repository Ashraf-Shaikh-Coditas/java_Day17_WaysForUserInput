package Week5.Day17;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your id : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        System.out.println("Enter your address : ");
        String address = scanner.nextLine();

        System.out.println("Enter your percentage : ");
        int percentage = scanner.nextInt();

        System.out.println("Id :: " + id +
                "\nName :: " + name +
                "\nAddress :: " + address +
                "\nPercentage :: " + percentage);
    }
}
