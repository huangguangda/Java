import java.util.Scanner;
/*
 * 此题要注意，如果是星期五的情况，后天是星期日
 */


public class L024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int Z = (D+2) % 7;
		if(Z == 0){
			Z=7;
		}
		System.out.print(Z);

	}

}
L1-024. 后天

如果今天是星期三，后天就是星期五；如果今天是星期六，后天就是星期一。我们用数字1到7对应星期一到星期日。给定某一天，请你输出那天的“后天”是星期几。 

 输入格式： 

输入第一行给出一个正整数D（1 <= D <=7），代表星期里的某一天。 

 输出格式： 

在一行中输出D天的后天是星期几。 
输入样例：3

输出样例：5

