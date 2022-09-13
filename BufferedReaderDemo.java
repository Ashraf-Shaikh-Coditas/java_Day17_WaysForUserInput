package Week5.Day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        int id = 0;
        String name;
        float percentage;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Student name :: ");
        name = br.readLine();

        System.out.println("Enter the id of Student :: ");
        id = Integer.parseInt(br.readLine());

        System.out.println("Enter Percentage :: ");
        percentage = Float.parseFloat(br.readLine());

        System.out.println("Student id is :: "+id+" Name is :: "+name+" " +
                " with percentage ::"+percentage);
    }
}

