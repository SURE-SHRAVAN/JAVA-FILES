import java.util.*;
public class Demo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Input first number: ");
		int a = s.nextInt();
		System.out.print("Input second number: ");
		int b = s.nextInt();
		System.out.print("Input third number: ");
		int c = s.nextInt();
		int min_Num = calc_Max(a, b, c);
		System.out.println("Minimum number is: "+min_Num);
	}
	public static int calc_Max(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}
}
