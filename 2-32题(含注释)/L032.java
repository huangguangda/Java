import java.util.Scanner;
/*
 * ��ȡ������ַ��������ճ���N��
 * ��ȡ�ַ���ts
 * ����ַ���ts����lg����N��ֱ�ӽ�ȡ���Nλ�����Ӵ������
 * ���������lg-N������ַ��������ts
 */

public class L032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		sc.nextLine();
		String ts = sc.nextLine();
		int lg = ts.length();
		if (N<=lg){
			String os = ts.substring(lg-N,lg);
			System.out.print(os);
		}else{
			int c = N-lg;
			for(int i=0;i<c;i++){
				System.out.print(s);
			}
			System.out.print(ts);
		}

	}

}
L1-032. Left-pad

��������΢���ϵ���Ϣ����һλ�����߲���NPM��Node Package Manager�����������ջ����Լ��Ŀ�Դ���룬���а���һ����left-pad��ģ�飬�������ģ���javascript�����React/Babel��̱���ˡ����Ǹ�ʲô����ģ�飿�������ַ���ǰ���һЩ������һ���ĳ��ȡ������á�*��ȥ����ַ�����GPLT����ʹ֮����Ϊ10������left-pad�Ľ����Ӧ���ǡ�******GPLT����Node����������left-pad����������һ��������������²ۡ������������ʵ��һ�����ģ�顣 

 �����ʽ�� 

�����ڵ�һ�и���һ��������N��<=104����һ���ַ����ֱ���������ַ����ĳ��Ⱥ����������ַ����м���1���ո�ֿ����ڶ��и���ԭʼ�ķǿ��ַ������Իس������� 

 �����ʽ�� 

��һ�����������ַ����� 
��������1��15 _
I love GPLT

�������1��____I love GPLT

��������2��4 *
this is a sample for cut

�������2�� cut

