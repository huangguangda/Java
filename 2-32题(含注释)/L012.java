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
L1-012. ����ָ��

���ûƭ�㣬������Ǽ��� ���� ����������Ĳ�����10��������n��Ҫ�������2n�����Ѱɣ�

 �����ʽ�� 

������һ���и���һ��������10��������n�� 

 �����ʽ�� 

��һ���а��ո�ʽ��2^n = �����������2n��ֵ�� 
����������5

���������2^5 = 32

