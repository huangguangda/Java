import java.util.ArrayList;
import java.util.Scanner;
/*
 * ���������������飬һ���Ǳ�������ѧ����Ϣ������S
 * ����һ���Ǳ����һ��ѧ����Ϣ�Ķ�̬���飬�����ǵ������е�S1��
 * ����S���ӵ�һ��Ԫ�ص�����Ԫ�ص�һ�����ѭ��
 * �ҵ��͵�һ��Ԫ��ƥ�����һ��Ԫ�ء���������Ӷ�̬����S1��ɾ����
 * �ڵڶ���Ԫ��Ҳ������ͬ�Ĳ���.....
 */

public class L030 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] S = new String[N];
		for (int i=0;i<N;i++){
			S[i] = sc.nextLine();
		}
		int d = N/2;
		ArrayList<String>S1 = new ArrayList<String>();
		for(int i=N-1;i>=d;i--){
			S1.add(S[i]);
		}
		for(int i=0;i<d;i++){
			String sex1 = S[i].split(" ")[0];
			String name1 = S[i].split(" ")[1];
			for(int j=0;j<S1.size();j++){
				String sex2 = S1.get(j).split(" ")[0]; 
				String name2 = S1.get(j).split(" ")[1];
				if(!sex2.equals(sex1)){
				   System.out.println(name1+" "+name2);
				   S1.remove(j);
				   break;
				}
			}
		}
		

	}

}
L1-030. һ��һ

��һ��һѧϰС�顱����Сѧ�г�����ѧϰ��֯��ʽ����ʦ��ѧϰ�ɼ���ǰ��ѧ����ѧϰ�ɼ������ѧ������һ�顣����������д���������ʦ�Զ����������乤�������ڵõ�ȫ��ѧ�����������ڵ�ǰ��δ�����ѧ���У��������ǰ��ѧ����������������ѧ����Ϊһ�顣 

 �����ʽ�� 

�����һ�и�����ż��N��<=50������ȫ��ѧ�����������˺�N�У��������δӸߵ��͵�˳�����ÿ��ѧ�����Ա�0����Ů����1������������������������8��Ӣ����ĸ�ķǿ��ַ������������1���ո�ָ������ﱣ֤������Ů������1:1������û�в������Ρ� 

 �����ʽ�� 

ÿ�����һ������ѧ���������������1���ո�ָ������θߵ�ѧ����ǰ�����ε͵�ѧ���ں�С������˳����ǰ��ѧ�������δӸߵ������С� 
����������8
0 Amy
1 Tom
1 Bill
0 Cindy
0 Maya
1 John
1 Jack
0 Linda

���������Amy Jack
Tom Linda
Bill Maya
Cindy John

