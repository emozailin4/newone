package scannerUse;
import java.util.Scanner;
public class PrintStar {
	public void PrintStar1(int Quantity) {//根据输入的数字输出星星
		for(int i = 0 ; i <Quantity ; i++) {
			System.out.println("*");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStar PrintStar = new PrintStar();
		Scanner sc = new Scanner(System.in);
		int Quantity = sc.nextInt();
		sc.nextLine();
		PrintStar.PrintStar1(Quantity);
		sc.close();
		
	}

}
