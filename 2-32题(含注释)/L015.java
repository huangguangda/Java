import java.util.Scanner;


public class L015 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String a = sc.next();
		int h =(int) Math.round((double)N/2);
		for(int i=0;i<h;i++){
			for(int j=0;j<N;j++){
				System.out.print(a);
			}
			if(i<(h-1)){
				System.out.print("\n");
			}
		}
	}

}
L1-015. ���°���һ�𻭷���

������ͳ�°��������������˶�ѧϰ��̣��������������д���룬��Ϊ������ʷ����λ��д������������ͳ��2014��ף�Ϊ��ף���������ѧ�����ܡ���ʽ�������°����д�˺ܼ򵥵ļ�������룺����Ļ�ϻ�һ�������Ρ�������Ҳ����һ�𻭰ɣ� 

 �����ʽ�� 

������һ���и��������α߳�N��3<=N<=21������������αߵ�ĳ���ַ�C�����һ���ո� 

 �����ʽ�� 

����ɸ����ַ�C�����������Ρ�����ע�⵽�м����м�������Ϊ���ý������ȥ���������Σ��������������ʵ������������50%����������ȡ������
����������10 a

���������aaaaaaaaaa
aaaaaaaaaa
aaaaaaaaaa
aaaaaaaaaa
aaaaaaaaaa

