import java.util.Scanner;


public class L010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int t;
		if(a>b){
			t = a;			
			a = b;
			b = t;
		}
		
		if(a>c){
			t = a;
			a = c;
			c = t;
			
		}
		
		if(b>c){
			t = c;
			c = b;
			b = t;
		}
		System.out.print(a+"->"+b+"->"+c);
		

	}

}
L1-010. 比较大小

本题要求将输入的任意3个整数从小到大输出。

 输入格式： 

输入在一行中给出3个整数，其间以空格分隔。 

 输出格式： 

在一行中将3个整数从小到大输出，其间以“->”相连。 
输入样例：4 2 8

输出样例：2->4->8

