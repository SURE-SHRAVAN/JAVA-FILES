import java.util.Scanner;

public class input_add {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two values: ");
       int x = s.nextInt();
       int  y = s.nextInt();
        System.out.println("Result of logicalAND is " + (x + y));
    }
}

