import java.util.ArrayList;
import java.util.Scanner;
/*
 * ������ѵ���Ҫ������ĵ绰������е��������У��ʹӴ�С����Ȼ��ȥ���ظ���ֵ
 * ����ʵ���㷨
 * 1.������ַ���ת�����ַ�����
 * 2.�ַ�����ת�����������飬��Ϊ�ַ�'0'��assii��Ϊ48�����Զ���48
 * 3.ʹ��ð���㷨���������򣬽���������е绰���롣�õ�����p
 * 4.������̬����arr��Ŀ����ȥ��p���ظ�ֵ
 * 5.֮��ʣ�µĹ���������Ŀ�Ĺ�������ok�ˡ�
 */

public class L027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		int[] p = new int[11];
		for(int i=0;i<11;i++){
			p[i] = (int)s[i]-48;
		}
		int[]pp = new int[11];
		for(int i=0;i<11;i++){
			pp[i] = p[i];
		}
		for(int i=0;i<10;i++){
		   int t = p[i];
		   for(int j=i+1;j<11;j++){
			   if (t<p[j]){
				   p[i] = p[j];
				   p[j] = t;
				   t = p[i];
			   }
		   }
		}
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int tp = -1;
		for(int i=0;i<11;i++){
			if(p[i]!=tp){
				arr.add(p[i]);
				tp = p[i];
			}
		}
		int[]index = new int[11];
		int lg = arr.size();
        for(int i=0;i<11;i++){
        	int t = pp[i];
        	for(int j=0;j<lg;j++){
        		if(t==arr.get(j)){
        			index[i] = j;
        			break;
        		}
        	}
        }
        System.out.print("int[] arr = new int[]{");
        for(int i=0;i<lg;i++){
        	if(i>0){  
        		System.out.print(",");
        	 }
        	System.out.print(arr.get(i));
        }
        System.out.println("};");
        System.out.print("int[] index = new int[]{");
        for(int i=0;i<11;i++){
        	if(i>0){  
        		System.out.print(",");
        	 }
        	System.out.print(index[i]);
        }
        System.out.print("};");
	}

}
һʱ������һƬ����������������ô�ơ���ʵ��δ���ܼ򵥣�index�������arr������±꣬index[0]=2 ��Ӧ arr[2]=1��index[1]=0 ��Ӧ arr[0]=8��index[2]=3 ��Ӧ arr[3]=0���Դ����ơ��� �����׵õ��绰������18013820100�� 

����Ҫ�����дһ������Ϊ�κ�һ���绰����������δ��� ���� ��ʵ�ϣ�ֻҪ������ǰ�����оͿ����ˣ����������ǲ���ġ� 

 �����ʽ�� 

������һ���и���һ����11λ������ɵ��ֻ����롣 

 �����ʽ�� 

Ϊ����ĺ������ɴ����ǰ���У�����arr�е����ֱ��밴�ݼ�˳������� 
����������18013820100

���������int[] arr = new int[]{8,3,2,1,0};
int[] index = new int[]{3,0,4,3,1,0,2,4,3,4,4};

