import java.util.Scanner;
/**
 * 
 * @author Administrator
 * �ؼ�Ҫ�����1�д򼸸����š��������оͿ��Ը��������д�ӡ��
 * �����x���Ǳ�ʾ��1��Ҫ���ַ��ĸ�����m��ʾ�ϰ��ɳ©����Ҫ����õĸ�������1�����������㣩��
 * n��ʾ�����ֵ��ϣ��Ҫ��ӡ���ŵĸ�������Ȼ����һ���ܴ��ꡣ��ˣ�y��ʾʣ��δ��ӡ���ŵĸ�����
 * t��ʾÿһ��Ҫ��ӡ���ŵĸ�����ÿ��һ�У�����������ţ����t��2Ϊ��λ������ݼ���
 *
 */
import java.util.Scanner;
public class L002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();		
		int p = in.indexOf(" ");
		int n = 0;
		try{
		n =Integer.parseInt(in.substring(0,p));
		}catch (Exception ee){
		   System.exit(0);
		}
		String f = in.substring(p+1);
		
		int x = 1;
		int m = 0;
		int y = 0;
		while((2*m+1)<=n){	
			x+=2;
			m = m+x;
			
		}
		if((2*m+1)>n){
			m = m-x;
			x-=2;
			
		}
		
		y = n-(2*m+1);
		
		
		
		for(int t=x;t>=1;t-=2){
			String str = "";
			int sp = (x-t)/2;
			for(int i=0;i<sp;i++){
				str+=" ";
			}
			for(int j=0;j<t;j++){
				str+=f;
			}
			System.out.println(str);
			
		}
		
		for(int t=3;t<=x;t+=2){
			String str = "";
			int sp = (x-t)/2;
			for(int i=0;i<sp;i++){
				str+=" ";
			}
			for(int j=0;j<t;j++){
				str+=f;
			}
			System.out.println(str);
			
		}
		System.out.println(y);

	}

}
L1-002. ��ӡɳ©

����Ҫ����д������Ѹ����ķ��Ŵ�ӡ��ɳ©����״���������17����*����Ҫ�����и�ʽ��ӡ
*****
 ***
  *
 ***
*****


��ν��ɳ©��״������ָÿ��������������ţ����з������Ķ��룻�������з�������2���������ȴӴ�С˳��ݼ���1���ٴ�С����˳���������β��������ȡ�

��������N�����ţ���һ�����������һ��ɳ©��Ҫ���ӡ����ɳ©���õ������ܶ�ķ��š�

 �����ʽ�� 

������һ�и���1��������N��<=1000����һ�����ţ��м��Կո�ָ��� 

 �����ʽ�� 

���ȴ�ӡ���ɸ���������ɵ�����ɳ©��״�������һ�������ʣ��û�õ��ķ������� 
����������19 *

���������*****
 ***
  *
 ***
*****
2

