import java.util.Scanner;


public class L028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int[]M = new int[N];
		for(int i=0;i<N;i++){
			M[i] = sc.nextInt();
			sc.nextLine();
		}
		
		for(int i=0;i<N;i++){
			int t = M[i];
			
			boolean is = true;
			if (t>3){
			 int l = (int)(Math.ceil(Math.sqrt(t)));
			for(int j=2;j<=l;j++){
				if(t % j==0){
					System.out.println("No");
					is =false;
					break;
				}
			}
			if(is){
				System.out.println("Yes");
			}
			}else{
				if(t==1){
					System.out.println("No");
				}else{
					System.out.println("Yes");
				}
			
			}
		}

	}

}
L1-028. �ж�����

�����Ŀ��ܼ򵥣������ж�һ���������������Ƿ������� 

 �����ʽ�� 

�����ڵ�һ�и���һ��������N��<=10�������N�У�ÿ�и���һ��С��231����Ҫ�жϵ��������� 

 �����ʽ�� 

��ÿ����Ҫ�жϵ��������������������������һ���������Yes�������������No���� 
����������2
11
111

���������Yes
No

