import java.util.Scanner;
/*
 * ����A,B
 * ����sumΪ0����Ϊ���ӽ����ű���
 * i��A��Bѭ��
 * ��iת�����ַ������������ĳ��ȡ�Ȼ����5���䳤�ȵõ���sp�����sp���ո����i
 * ���i��5ȡģ����0������
 * ������һ�в���5���ַ���������з�
 * ������ӽ��
 */
import java.util.Scanner;
public class L008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = 0;
		int rcount = 0;
		for (int i=A;i<=B;i++){
			sum+=i;
			String s = String.valueOf(i);
			int sp = 5-s.length();
			for(int j=1;j<=sp;j++){
				System.out.print(" ");				
			}
			System.out.print(s);
			rcount++;
			if(rcount % 5 ==0){
				System.out.print("\n");
			}
		}
		if((B-A+1) % 5 !=0){
			System.out.print("\n");
		}
		System.out.print("Sum = "+sum);

	}

}
L1-008. �������κ�

������������A��B�������A��B�����������Լ���Щ���ĺ͡�

 �����ʽ�� 

������һ���и���2������A��B������-100<=A<=B<=100������Կո�ָ��� 

 �����ʽ�� 

����˳�������A��B������������ÿ5������ռһ�У�ÿ������ռ5���ַ���ȣ����Ҷ��롣�����һ�������ȫ�����ֵĺ͡� 
����������-3 8

���������   -3   -2   -1    0    1
    2    3    4    5    6
    7    8
Sum = 30
