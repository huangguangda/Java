import java.util.Scanner;



public class L022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int js=0,os=0;
		for(int i=0;i<N;i++){
			int t = sc.nextInt();
			if(t % 2==0){
				os++;
			}else{
				js++;
			}
			
		}
		System.out.print(js+" "+os);

	}

}
L1-022. ��ż�ּ�

����N������������ͳ��������ż�����ж��ٸ��� 

 �����ʽ�� 

�����һ�и���һ������N��<= 1000������2�и���N�����������Կո�ָ��� 

 �����ʽ�� 

��һ�����Ⱥ���������ĸ�����ż���ĸ������м���1���ո�ָ��� 
����������9
88 74 101 26 15 0 34 22 77

���������3 6

