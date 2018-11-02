package scannerUse;
import java.util.Scanner;
public class Multiply {
	public void MultiplyTable(int MaxNumber) {
		int BeginNumber = 1;
		int MaxBeginNumber = 1;
		if((MaxNumber>=1)&(MaxNumber<=9)){//对输入的数字进行判断
			for(MaxBeginNumber = 1;MaxBeginNumber <= MaxNumber; MaxBeginNumber++) {//外部循环
				for(BeginNumber = 1;BeginNumber <= MaxBeginNumber ;BeginNumber++) {//内部循环
					int Answer = BeginNumber * MaxBeginNumber;//答案
					System.out.println(BeginNumber+"*"+MaxBeginNumber +"=" +Answer);//打印出来
				}
			}
		}else{
			System.out.println("请输入范围内的数字");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
