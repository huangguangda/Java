import java.util.ArrayList;
import java.util.Scanner;
/*
 * ��ʼ��һ������������P����10���Ԫ�أ���ʼֵĬ����false;
 * ѭ�����е�����Ȧ���������ѵ�id����ΪP���±꣬���Ӧ��ֵ��Ϊtrue
 * Ϊ���Ż��ٶȣ����������һ������Ȧ����������Ϊ1��ֱ�Ӻ��ԣ�����һ������Ȧ
 * ����������Ƿ������ѵ�ÿһ��id��������id��ӦP�±��Ƿ�Ϊfalse����ʵ����ô�����id����ʾ��û�����ѡ�
 * ��������˶������ѣ���ô�����No one is handsome
 */

public class L020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		boolean[]P = new boolean[100000];
		boolean hs = false;
		boolean first = true;
		for(int i=0;i<N;i++){
			int K = sc.nextInt();
			if (K==1){
				sc.nextLine();
				continue;				
			}else{
				for(int j=0;j<K;j++){
					int S = sc.nextInt();
					if(P[S]==false){
					   P[S] = true;					   
					}
					
				}
				sc.nextLine();
			}
		}
		
		int M = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<M;i++){
			int S=sc.nextInt();
			if(!P[S]){
				P[S]=true;
				hs = true;
				if (!first){
					System.out.print(" ");
				}
				if(first){
					first = false;
				}
				int x = 5-String.valueOf(S).length();
				for(int j=0;j<x;j++){
					System.out.print("0");
				}
				System.out.print(S);
				
			}
		}
		if(!hs){
			System.out.print("No one is handsome");
		}
	
		

	}

}
L1-020. ˧��û����

��ܿܿ����æ��������Ȧ�з���Ƭ��ʱ������һЩ����Ϊ̫˧��û�����ѡ������Ҫ�����ҳ���Щ˧��û�����ѵ��ˡ� 

 �����ʽ�� 

�����һ�и���һ��������N��<=100��������֪����Ȧ�ĸ��������N�У�ÿ�����ȸ���һ��������K��<=1000����Ϊ����Ȧ�е�������Ȼ���г�һ������Ȧ�ڵ������ˡ���Ϊ���������ÿ�˶�Ӧһ��ID�ţ�Ϊ5λ���֣���00000��99999����ID���Կո�ָ���֮�����һ��������M��<=10000����Ϊ����ѯ�����������һ�����г�M������ѯ��ID���Կո�ָ��� 

ע�⣺û�����ѵ��˿����Ǹ���û��װ������Ȧ����Ҳ������ֻ���Լ�һ����������Ȧ���ˡ���Ȼ�и�����������Լ����Լ������ӽ�����Ȧ������Ŀ��֤����K����1������Ȧ�ﶼ������2����ͬ���ˡ�

 �����ʽ�� 

�������˳�������Щ˧��û���ѵ��ˡ�ID����1���ո�ָ����е���β�����ж���ո����û����̫˧���������No one is handsome���� 

ע�⣺ͬһ���˿��Ա���ѯ��Σ���ֻ���һ�Ρ�
��������1��3
3 11111 22222 55555
2 33333 44444
4 55555 66666 99999 77777
8
55555 44444 10000 88888 22222 11111 23333 88888

�������1��10000 88888 23333

��������2��3
3 11111 22222 55555
2 33333 44444
4 55555 66666 99999 77777
4
55555 44444 22222 11111

�������2��No one is handsome

