import java.util.Scanner;
/*
 * ���ζ���ÿһ������������ÿ����һ�����Ӽ�һ����
 * ������ÿ�������ķ�ĸ�������ĸ�����ս��Ϊib,���ӷֱ���Ա˴˵ķ�ĸȻ����������ս��Ϊia
 * ���յ���ӽ��Ϊzs = ia/ib
 * Ȼ�������������
 * ʣ�µľ�����С�������Ƿ�ĸ���ڷ��ӵ���
 * ������������ӷ�ĸ�Ĺ����ӣ�ÿ���һ�����ͷ��ӷ�ĸͬʱ���Դ�����
 */
import java.util.Scanner;
public class L009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String a,b;
		long ia=0,ib=1,pa,pb;
		sc.nextLine();
		String str = sc.nextLine();
		String[] s= str.split(" ");
		for(int i=0;i<N;i++){
		
			a = s[i].split("/")[0];
			b = s[i].split("/")[1];
			pa = Integer.parseInt(a);
			pb = Integer.parseInt(b);
			pa = pa * ib;
			ia = ia * pb;
			ib = ib * pb;
			ia = ia + pa;
		}
		
		long zs = 0;
		zs = ia / ib;
		if (zs !=0){
			System.out.print(zs);
		}
		ia = ia - zs * ib;
		
		if(ia!=0){
		
		for(long i=2;i<=ia;i++){
			if(ia % i == 0 ){
				if(ib % i==0){
					ia = ia/i;
					ib = ib/i;
					i = 2;
				}
			}
		}
		if(zs!=0){
			System.out.print(" ");
		}
		System.out.print(ia+"/"+ib);
		}

	}

}
L1-009. N�������

�����Ҫ��ܼ򵥣�������N�����ֵĺ͡��鷳���ǣ���Щ��������������������/��ĸ������ʽ�����ģ�������ĺ�Ҳ����������������ʽ�� 

 �����ʽ�� 

�����һ�и���һ��������N��<=100�������һ�а���ʽ��a1/b1 a2/b2 ...������N������������Ŀ��֤���з��Ӻͷ�ĸ���ڳ����ͷ�Χ�ڡ����⣬�����ķ���һ�������ڷ���ǰ�档 

 �����ʽ�� 

����������ֺ͵������ʽ ���� �������д�ɡ��������� �������֡������з�������д�ɡ�����/��ĸ����Ҫ�����С�ڷ�ĸ��������û�й����ӡ�����������������Ϊ0����ֻ����������֡� 
��������1��5
2/5 4/15 1/30 -2/60 8/3

�������1��3 1/3

��������2��2
4/3 2/3

�������2��2

��������3��3
1/3 -1/6 1/8

�������3��7/24

