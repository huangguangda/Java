import java.util.Scanner;
/*
 * ����ļ����Ƕ�������ַ������ӵ�һ�������һ������ͳ��
 * G�м�����P�м�����L�м�����T�м���
 * Ȼ���1�������ַ����ĳ���ѭ��
 * �������GPLT
 */

public class L023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String si= sc.nextLine();
		int G=0,P=0,L=0,T=0;
		char[] s = si.toCharArray();
		int lg = s.length;
		char t;
		for(int i=0;i<lg;i++){
			t = s[i];
			switch (t){
			    case 'G':
			    	G++;
			    	break;
			    case 'g':
			    	G++;
			    	break;
			    case 'P':
			    	P++;
			    	break;
			    case 'p':
			    	P++;
			    	break;
			    case 'L':
			    	L++;
			    	break;
			    case 'l':
			    	L++;
			    	break;
			    case 'T':
			    	T++;
			    	break;
			    case 't':
			    	T++;
			    	break;
			}
		}
		for(int k=0;k<lg;k++){
			if(k<G){
				System.out.print("G");
			}
			if(k<P){
				System.out.print("P");
			}
			if(k<L){
				System.out.print("L");
			}
			if(k<T){
				System.out.print("T");
			}
			
		}

	}

}
L1-023. ���GPLT

����һ�����Ȳ�����10000�ġ�����Ӣ����ĸ���ɵ��ַ������뽫�ַ����µ���˳�򣬰���GPLTGPLT....��������˳������������������ַ�����Ȼ�������ַ��������ִ�Сд���ĸ�����һ����һ����ģ���ĳ���ַ��Ѿ�����꣬�����µ��ַ��԰�GPLT��˳���ӡ��ֱ�������ַ����������

 �����ʽ�� 

������һ���и���һ�����Ȳ�����10000�ġ�����Ӣ����ĸ���ɵķǿ��ַ����� 

 �����ʽ�� 

��һ���а���ĿҪ������������ַ�������Ŀ��֤����ǿա�
����������pcTclnGloRgLrtLhgljkLhGFauPewSKgt

���������GPLTGPLTGLTGLGLL

