import java.util.Scanner;


public class L012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 2;
		for(int i=1;i<n;i++){
			m = m*2;
		}
		System.out.print("2^"+n+" = "+m);

	}

}
L1-012. 计算指数

真的没骗你，这道才是简单题 —— 对任意给定的不超过10的正整数n，要求你输出2n。不难吧？

 输入格式： 

输入在一行中给出一个不超过10的正整数n。 

 输出格式： 

在一行中按照格式“2^n = 计算结果”输出2n的值。 
输入样例：5

输出样例：2^5 = 32

