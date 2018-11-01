package scannerUse;
import java.util.Scanner;

public class MaxTest {
	public int max(int NumberA,int NumberB) {
		int A = NumberA>NumberB?NumberA:NumberB;//简单判断输入的两个数哪个数字大
		int max = A;
		return max;
	}
	public boolean equa(int NumberA,int NumberB) {
		boolean A = NumberA == NumberB?true:false;//判断输入的两个数是否相等
		return A;
	}
	public int BiggestOne(int NumberA,int NumberB,int NumberC) {
		int A = (NumberA>NumberB?NumberA:NumberB)>NumberC?(NumberA>NumberB?NumberA:NumberB):NumberC;//简单判断输入的三个数是否相等
		return A;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int FirstNumber = sc.nextInt();
		sc.nextLine();//吃掉符号
		int SecondNumber = sc.nextInt();
		MaxTest max = new MaxTest();
		int LargerOne = max.max(FirstNumber,SecondNumber);
		boolean isequal = max.equa(FirstNumber, SecondNumber);
		sc.nextLine();//吃掉符号
		int ThirdNumber = sc.nextInt();
		int BiggestOne = max.BiggestOne(FirstNumber, SecondNumber, ThirdNumber);
		System.out.println(LargerOne);
		System.out.println(isequal);
		System.out.println(BiggestOne);
		sc.close();
		
	}

}
