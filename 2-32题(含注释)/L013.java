import java.util.Scanner;


public class L013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int sum = 0;
		int jc = 1;
		for(int i=1;i<=S;i++){
			jc =1;
			for(int j=1;j<=i;j++){
				jc = jc * j;
			}
			sum = sum + jc;
		}
		System.out.print(sum);

	}

}
L1-013. 计算阶乘和

对于给定的正整数N，需要你计算 S = 1! + 2! + 3! + ... + N!。

 输入格式： 

输入在一行中给出一个不超过10的正整数N。 

 输出格式： 

在一行中输出S的值。
输入样例：3

输出样例：9

