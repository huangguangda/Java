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
L1-013. ����׳˺�

���ڸ�����������N����Ҫ����� S = 1! + 2! + 3! + ... + N!��

 �����ʽ�� 

������һ���и���һ��������10��������N�� 

 �����ʽ�� 

��һ�������S��ֵ��
����������3

���������9

