import java.util.ArrayList;
import java.util.Scanner;
/*
 * ��һ���������ӿ��Դ��ô����Դ�2�����������ƽ����һ����ȥ�������������Ϊ0��˵��������
 * l��N��ƽ��������ȡ���Ľ��
 * ������㷨˼��Ϊ
 * c��1���������ϲ���ÿһ�����Ƿ�Ϊ����
 * s,e��Ϊ��ǣ�s�Ǳ�ǿ�ʼ��e�ǵ�ǰ���ԵĽ�����
 * min��ʾ�������ӵ���Сֵ��max��ʾ�������ӵ����ֵ
 * s,e,c,min,max��ʼֵΪ2.count��ʾ�������ӵĳ��ȣ���ʼֵΪ1
 * 1.�ж�c�Ƿ�������
 * 2.����ǣ���ʾ�п������������ӵ���ɲ��֣�e�͵���c,c��1���粻�ǣ�ת4
 * 3.�����ʱ��c>l��ʾ�Ѿ����˲���ֵ�����Χ���˳�ѭ�������ң�������ǰ��������Χ�Ƿ���
 * ���ģ�����ǣ���ômin,��max�ֱ�ֵs,��e�����c<=l����ѭ����ת1
 * 4.������Ժͽ������e��s֮�����count����ôcount����e-s�����ң���ômin,��max�ֱ�ֵs,��e��
 * c����1������ѭ����ת1
 * 
 */
L1-006. ��������

һ��������N�������п��ܴ����������������֡�����630���Էֽ�Ϊ3*5*6*7������5��6��7����3�����������֡�������һ������N��Ҫ���д���������������ӵĸ������������С�������������С�

 �����ʽ�� 

������һ���и���һ��������N��1<N<231���� 

 �����ʽ�� 

�����ڵ�1�������������ӵĸ�����Ȼ���ڵ�2���а�������1*����2*����*����k���ĸ�ʽ�����С�������������У��������Ӱ�����˳�������1�������ڡ�
����������630

���������3
5*6*7



public class L006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ary = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int l = (int)Math.ceil(Math.sqrt(N));
		int s=2,e=2,c=2,min=2,max=2;
		boolean is = true;
		int count =1;
		while(s<=l){
			if(N % c ==0){
				is = false;
				e = c;
				c++;
				if(c>l){
					if(count<(e-s+1)){
						count = e -s +1;
						min = s;
						max = e;
					}
					break;					
				}
				
			}else{
				if(count<(e-s+1)){
					count = e -s +1;
					min = s;
					max = e;
				}
				s = ++c;				
			}
		}
		
		if(min==max){
			System.out.println(1);
			if(!is){
				System.out.print(min);
			}else{
				System.out.print(N);
			}
			
		}else{	
		
			System.out.println(count);
			for(int i=min;i<=max;i++){
				System.out.print(i);
				if(i!=max){
					System.out.print("*");
				}
			}
		
		}

	}

}
