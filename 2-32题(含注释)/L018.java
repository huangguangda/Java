import java.util.Scanner;
/*
 * 1.�����ʾʱ����С��12����ôֱ����� �����ʱ�䣬���� Too early to Dang
 * 2.��������պ��� 12��������룬Ҳ����һ����ô���
 * 3.��������ֲ�Ϊ�㣬ʱ������1
 * 4.ʱ���� = ʱ������12ȥģ
 * 5.���ģ����0����ôʱ��������12��
 * 6.���ʱ������ dang
 */


public class L018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		int hh = 0;
		int mm = 0;
		String h = time.split(":")[0];
		String m = time.split(":")[1];
		hh = Integer.valueOf(h);
		mm = Integer.valueOf(m);
		if(hh<12){
			System.out.print("Only "+h+":"+m+".  Too early to Dang.");
		}else{
			if(hh==12 && mm==0){
				System.out.print("Only "+h+":"+m+".  Too early to Dang.");
			}else{
				if(mm!=0){
					hh++;
				}
				hh = hh % 12;
				if (hh==0){
					hh = 12;
				}
				for(int i=0;i<hh;i++){
					System.out.print("Dang");
				}
			}
		}
		

	}

}
L1-018. ����

΢�����и��Գơ�����V���ļһÿ�����Ӵߴ���ũ�ǰ�ϧ�������˯�����������ڱ����Լ���ϢҲ���Ǻܹ��ɣ��������Ӳ�����ʱ��һ�����ӵĵ����Ǹ�������ʱ������ģ����������ĳ�������ã���ô���������͵����Ǹ�������������������㣬������һ�������������⣬��Ȼһ����24Сʱ����ȴ��ֻ�ں������1~12�¡�������23:00���ӣ����ǡ���������������������������������23:01�ͻ��ǡ���������������������������������ҹ00:00������12:00�ڼ䣨�˵�ʱ��������ڣ��������ǲ��õġ� 

���������д�����򣬸��ݵ�ǰʱ����������ӡ�

 �����ʽ�� 

�����һ�а��ա�hh:mm���ĸ�ʽ������ǰʱ�䡣����hh��Сʱ����00��23֮�䣻mm�Ƿ��ӣ���00��59֮�䡣 

 �����ʽ�� 

���ݵ�ǰʱ����������ӣ�����һ���������Ӧ��������Dang����������������ڣ��������
Only hh:mm.  Too early to Dang.


���С�hh:mm���������ʱ�䡣 
��������1��19:05

�������1��DangDangDangDangDangDangDangDang

��������2��07:05

�������2��Only 07:05.  Too early to Dang.

