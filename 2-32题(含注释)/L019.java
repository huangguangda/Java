import java.util.ArrayList;
import java.util.Scanner;
/*
 * �ӹ���֪�� ��ȭ��¼���ĸ����У���� ��2=��1+��3�����䣬��� ��4 = ��1+��3�����䡣
 * Ҫע�����ͬʱӮ�������ȣ�ͬʱ�䣬���ȡ�ͬ�䣬����ͬӮ�������Ƿ������Ѿ��ﵽ���߳������������������һ�֣������ᵽ��
 * ���ǣ�ֻҪ��һ��ֻ��һ����Ӯ����ô�Ϳ������һ���Ƿ��Ѿ����ڻ���С��������ܺȱ���������ǣ���ô���һ������
 * 
 */

public class L019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int a = A;
		int b = B;
	
		sc.nextLine();
		int count = sc.nextInt();
		sc.nextLine();
		ArrayList<String> rc =new ArrayList<String>();
		for(int i=0;i<count;i++){
			rc.add(sc.nextLine());
		}
		for(int i=0;i<count;i++){
			String s1 = rc.get(i).toString().split(" ")[0];
			String s2 = rc.get(i).toString().split(" ")[1];
			String s3 = rc.get(i).toString().split(" ")[2];
			String s4 = rc.get(i).toString().split(" ")[3];
			int k1 = Integer.parseInt(s1)+Integer.parseInt(s3);
			int A1 = Integer.parseInt(s2);
			int B1 = Integer.parseInt(s4);
			if((A1 == k1) && (B1 == k1)){
				A--;
				B--;
				continue;
			}
			else if((A1 != k1) && (B1 != k1)){
				continue;
			}
			if(A1 == k1){
				A--;
				if(A<=0){
					System.out.println("A");
					System.out.print(b-B);
					break;
				}
			}
			if(B1 == k1){
				B--;
				if(B<=0){
					System.out.println("B");
					System.out.print(a-A);
					break;
				}
			}
			
		}
		
			
		
		
		
	}

}
L1-019. ˭�ȵ�

��ȭ�ǹ����й����Ļ���һ����Ȥ����ɲ��֡����������˻�ȭ�ķ���Ϊ��ÿ�˿��к���һ�����֣�ͬʱ���ֱȻ���һ�����֡����˭�Ȼ������������õ������˺���������֮�ͣ�˭�����ˣ���ҷ�һ���ơ�����ͬӮ������ͬ���������һ�֣�ֱ��Ψһ��Ӯ�ҳ��֡� 

��������ס������˵ľ���������ܺȶ��ٱ��������ͻ�ȭ��¼�������ж�������˭�ȵ���

 �����ʽ�� 

�����һ���Ⱥ�����ס������˵ľ�����������100�ķǸ����������Կո�ָ�����һ�и���һ��������N��<=100�������N�У�ÿ�и���һ�ֻ�ȭ�ļ�¼����ʽΪ��

�׺� �׻� �Һ� �һ�

���С������Ǻ��������֣��������ǻ��������֣���Ϊ������100������������ֻ��һ�𻮣��� 

 �����ʽ�� 

�ڵ�һ��������ȵ��µ��Ǹ��ˣ�A����ף�B�����ҡ��ڶ��������û�����Ǹ��˺��˶��ٱ�����Ŀ��֤��һ���˵��¡�ע����������˵��¾���ֹ����������ݲ��ش���
����������1 1
6
8 10 9 12
5 10 5 10
3 8 5 12
12 18 1 13
4 16 12 15
15 1 1 16

���������A
1

