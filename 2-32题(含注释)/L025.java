import java.util.Scanner;
/*
 * ����Ҫע�����A����û�����룬��������һ���ո�Ȼ����ַ���
 */

public class L025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String AB = sc.nextLine();
		String[]T = AB.split(" ");
		String A = T[0];
		String B = "";
		if(T.length>2){
			B = "?";
		}else{
			B= T[1];
		}
		
		String OA="?",OB="?",OC="?";
		boolean isa=false,isb=false;
		try{
			int ca = Integer.parseInt(A);
			if(ca>0 && ca<=100){
				OA = String.valueOf(ca);
				isa = true;
			}
		}catch(Exception ee){
			
		}
		try{
			int cb = Integer.parseInt(B);
			if(cb>0 && cb<=1000){
				OB = String.valueOf(cb);
				isb =true;
			}
			
		}catch(Exception ee){
			
		}
		if(isa && isb){
			OC = String.valueOf(Integer.parseInt(OA)+Integer.parseInt(OB));
		}
		System.out.print(OA+" + "+OB+" = "+OC);

	}

}
L1-025. ������A+B

�����Ŀ��ܼ򵥣�����������������A��B�ĺͣ�����A��B��������[1,1000]����΢�е��鷳���ǣ����벢����֤�������������� 

 �����ʽ�� 

������һ�и���A��B������Կո�ֿ���������A��B��һ��������Ҫ�������������ʱ������ǳ�����Χ�����֡���������С�����ʵ����������һ�����롣 

ע�⣺���ǰ������г��ֵĵ�1���ո���Ϊ��A��B�ķָ�����Ŀ��֤���ٴ���һ���ո񣬲���B����һ�����ַ�����

 �����ʽ�� 

��������ȷ���������������򰴸�ʽ��A + B = �͡���������ĳ�����벻��Ҫ��������Ӧλ�������?������Ȼ��ʱ��Ҳ�ǡ�?���� 
��������1��123 456

�������1��123 + 456 = 579

��������2��22. 18

�������2��? + 18 = ?

��������3��-100 blabla bla...33

�������3��? + ? = ?

