import java.util.Scanner;
/**
 * 
 * @author Administrator
 * �ȶ���һ���������飬10��Ԫ�أ�0��9ʮ�������ֵĴ�������ڶ�Ӧ�±��ֵ��
 *��0��10����ѭ����ѭ������Ϊi
 *�����ַ�������ǰѭ��ֵi���ַ������ֵĴ������ϼƺ���� d[i]��
 *���������������0�����
 */

public class L003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d = {0,0,0,0,0,0,0,0,0,0};
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		for(int i=0;i<10;i++){
			String D = String.valueOf(i);
			int j=0;
			int dcount = 0;
			while((N.indexOf(D,j)!=-1) && j<N.length()){
				dcount++;
				j = N.indexOf(D,j)+1;
			}
			d[i] = dcount;
		}
		for(int i=0;i<10;i++){
			if(d[i]>0){
				System.out.println(String.valueOf(i)+":"+String.valueOf(d[i]));
			}
		}

	}

}
L1-003. ��λ��ͳ��

����һ��kλ����N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)�����д����ͳ��ÿ�ֲ�ͬ�ĸ�λ���ֳ��ֵĴ��������磺����N = 100311������2��0��3��1����1��3��

 �����ʽ�� 

ÿ���������1��������������һ��������1000λ��������N��

 �����ʽ�� 

��N��ÿһ�ֲ�ͬ�ĸ�λ���֣���D:M�ĸ�ʽ��һ���������λ����D������N�г��ֵĴ���M��Ҫ��D�����������
����������100311

���������0:2
1:3
3:1
