//take two number input from user and swap it
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1 and num2");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.printf("Num1 = %d & Num2 = %d\n", num1, num2);
		int holder = num1;
		num1 = num2;
		num2 = holder;
	    System.out.printf("Num1 = %d & Num2 = %d\n", num1, num2);
	}
}
