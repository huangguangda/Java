import java.util.ArrayList;
import java.util.Scanner;
/*
 * ����ÿһ����������֤�ţ�
 * ���ǰ17���ַ����Ƿ�Ϊ���֣��������������,��ô�����֤�Ų��Ϸ���ֱ����������������һ�����֤��
 * ���ǰ17�������֣���ô��17�����ļ�Ȩ�ͼ���������11ȥģ��ȥ�Դ�ģΪ�±��M�����ֵ�������Ƿ�͵�18λ��ȣ��粻�ȣ��������Ϸ�����������������һ�����֤��
 */

public class L016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]q = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        char[]M ={'1','0','X','9','8','7','6','5','4','3','2'};
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String id;
        boolean allright=true;
        boolean isnum = true;
        sc.nextLine();
        ArrayList<String> lid = new ArrayList<String>();
        for(int i=0;i<N;i++){
        	lid.add(sc.nextLine());
        }
        for(int i=0;i<N;i++){
        	isnum = true;
        	id = lid.get(i).toString();
        	char[] cid = id.toCharArray();
        	int sum = 0;
        	for(int j=0;j<cid.length-1;j++){
        		if(cid[j]>='0' && cid[j]<='9'){
        			int  k = Integer.parseInt(String.valueOf(cid[j]));        		
        			sum = sum+k*q[j];
        		}else{
        			allright = false;
        			isnum = false;
        			break;
        		}
        		
        	}
        	if(isnum){
        		int Z = sum % 11;
        		char e = cid[cid.length-1];
        		if(e!=M[Z]){
        			allright = false;
        			System.out.println(id);
        		}
        	}else{
        		System.out.println(id);
        	}
        	
        	
        }
        if(allright){
        	System.out.print("All passed");
        }
	}

}
L1-016. �������֤

һ���Ϸ������֤������17λ���������ڱ�ź�˳���ż�1λУ������ɡ�У����ļ���������£� 

���ȶ�ǰ17λ���ּ�Ȩ��ͣ�Ȩ�ط���Ϊ��{7��9��10��5��8��4��2��1��6��3��7��9��10��5��8��4��2}��Ȼ�󽫼���ĺͶ�11ȡģ�õ�ֵZ����������¹�ϵ��ӦZֵ��У����M��ֵ��

Z��0 1 2 3 4 5 6 7 8 9 10
 M��1 0 X 9 8 7 6 5 4 3 2 

���ڸ���һЩ���֤���룬������֤У�������Ч�ԣ������������ĺ��롣

 �����ʽ�� 

�����һ�и���������N��<= 100������������֤����ĸ��������N�У�ÿ�и���1��18λ���֤���롣 

 �����ʽ�� 

���������˳��ÿ�����1������������֤���롣���ﲢ������ǰ17λ�Ƿ����ֻ���ǰ17λ�Ƿ�ȫΪ���������1λУ�������׼ȷ��������к��붼�������������All passed���� 
��������1��4
320124198808240056
12010X198901011234
110108196711301866
37070419881216001X

�������1��12010X198901011234
110108196711301866
37070419881216001X

��������2��2
320124198808240056
110108196711301862

�������2��All passed

