import java.util.Scanner;


public class L029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		double W = (H-100)*0.9*2;
		String r = String.format("%.1f",W);
		System.out.print(r);

	}

}
L1-029. �ǲ���̫����

��˵һ���˵ı�׼����Ӧ��������ߣ���λ�����ף���ȥ100���ٳ���0.9���õ��Ĺ���������֪�н��ǹ�����������ָ���ĳ����ߣ�����������׼����Ӧ���Ƕ��٣���˳��Ҳ���ĸ��Լ���һ�°ɡ����� 

 �����ʽ�� 

�����һ�и���һ��������H��100 < H <= 300����Ϊĳ����ߡ� 

 �����ʽ�� 

��һ���������Ӧ�ı�׼���أ���λΪ�н����С�����1λ�� 
����������169

���������124.2

