import java.util.ArrayList;
import java.util.Scanner;
/*
 * caΪ����A���ַ����飬cbΪ����B���ַ�����
 * 1.��ca�����ÿһ���ַ����������²���
 * 2.����cb��ÿһ���ַ������������ȵģ���������ַ���ֱ������1
 * 3.��������ȣ���������ַ�����ת��1
 */

public class L011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		
		char[] ca = a.toCharArray();
		char[] cb = b.toCharArray();
		
		int la = ca.length;
		int lb = cb.length;
		char t;
		boolean isin=false;
		
		for(int i=0;i<la;i++){
			t = ca[i];
			isin=false;
			for(int j=0;j<lb;j++){
				if(t==cb[j]){
					isin = true;
					break;
				}
			}
			if(!isin){
				System.out.print(t);
			}
		}
		

	}

}
L1-011. A-B

����Ҫ�������A-B�������鷳���ǣ�A��B�����ַ��� ���� �����ַ���A�а��ַ���B���������ַ�ȫɾ����ʣ�µ��ַ���ɵľ����ַ���A-B��

 �����ʽ�� 

������2�����Ⱥ�����ַ���A��B�����ַ����ĳ��ȶ�������104�����ұ�֤ÿ���ַ��������ɿɼ���ASCII��Ϳհ��ַ���ɣ�����Ի��з������� 

 �����ʽ�� 

��һ���д�ӡ��A-B�Ľ���ַ����� 
����������I love GPLT!  It's a fun game!
aeiou

���������I lv GPLT!  It's  fn gm!

