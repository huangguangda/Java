import java.util.Scanner;
/*
 * ����һ�����飬����Ϊ10��ֵ��˳���Ӧ"ling","yi","er","san","si","wu","liu","qi","ba","jiu"��
 * ������������±���Ƕ�Ӧ������ֵ
 * ѭ������ÿһ���ַ�
 * ����� ���ţ���� -
 * ����ת��������������Ϊ�±꣬��������Ӧ��ֵ
 */
import java.util.Scanner;
public class L007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ary={"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
		Scanner sc = new Scanner(System.in);
		
		String szs = sc.nextLine();
		for(int i=0;i<szs.length();i++){
			String t = szs.substring(i,i+1);
			if(t.equals("-")){
				System.out.print("fu");
			}else{
				int idx = Integer.parseInt(t);
				System.out.print(ary[idx]);
			}
			if (i!=(szs.length()-1)){
				System.out.print(" ");
			}
		}

	}

}

L1-007. ������

����һ�����������ÿ�����ֶ�Ӧ��ƴ����������Ϊ����ʱ���������fu���֡�ʮ�����ֶ�Ӧ��ƴ�����£� 
0: ling
1: yi
2: er
3: san
4: si
5: wu
6: liu
7: qi
8: ba
9: jiu



�����ʽ�� 

������һ���и���һ���������磺 1234 �� 

��ʾ������������������������� 

 �����ʽ�� 

��һ����������������Ӧ��ƴ����ÿ�����ֵ�ƴ��֮���ÿո�ֿ�����ĩû�����Ŀո��� yi er san si��
����������-600

���������fu liu ling ling
