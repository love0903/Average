import java.util.InputMismatchException;
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		while (true) {
		try {
			Scanner scanner = new Scanner(System.in);
			double sum = 0;
			int count = 0;
			int number;
			while(true) {
				number = scanner.nextInt();
			if(number == 0) { break; }
				sum += number;
				count++;
}
			System.out.printf("平均 %.2f%n", sum / count);
}catch (InputMismatchException x) {
	System.out.println("必須輸入整數"); }

		}
}
}