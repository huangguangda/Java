import java.util.Scanner;


public class L004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int F;
		try{
			F = sc.nextInt();
			int C = 5*(F-32)/9;
			System.out.print("Celsius = "+C);
		}catch(Exception ee){
			System.out.print("");
			System.exit(0);
		}

	}

}

L1-004. ���������¶�

����һ�������¶�F������Ҫ���д���򣬼����Ӧ�������¶�C�����㹫ʽ��C = 5*(F-32)/9����Ŀ��֤����������������ͷ�Χ�ڡ�

 �����ʽ�� 

������һ���и���һ�������¶ȡ� 

 �����ʽ�� 

��һ���а��ո�ʽ��Celsius = C�������Ӧ�������¶�C������ֵ�� 
����������150

���������Celsius = 65

