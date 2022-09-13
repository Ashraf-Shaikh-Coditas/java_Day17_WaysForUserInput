package Week5.Day17;

public class CommandLineArgumentDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (String s : args) {
            sum += Integer.parseInt(s);
        }

        System.out.println("Sum is : "+sum);
    }
}

/*

Sum is : 55


* */
