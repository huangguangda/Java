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
L1-010. �Ƚϴ�С

����Ҫ�����������3��������С���������

 �����ʽ�� 

������һ���и���3������������Կո�ָ��� 

 �����ʽ�� 

��һ���н�3��������С�������������ԡ�->�������� 
����������4 2 8

���������2->4->8

