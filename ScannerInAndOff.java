package scannerUse;
import java.util.Scanner;
public class ScannerInAndOff {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		String StringInput = sc.nextLine();
		System.out.println(StringInput);
		
		int sum = 0;
		while(sc.hasNextInt()) {
			int NextNumber1 = sc.nextInt();
			sum = sum +NextNumber1;
		}
		System.out.println("输入的所有整数的和为"+sum);	
		
		
		
		
	}
}
