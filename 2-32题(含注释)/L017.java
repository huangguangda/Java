import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * ���NΪż������ôN %2 ����0����ôisoΪtrue
 * ����N��������2������t
 * ����N�Ƿ��Ǹ��������ǣ�isfΪtrue
 * ��󣬰��չ���ʹ��t����N�ĳ��ȣ�����Ǹ������ٳ���1.5�������....
 */

public class L017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		boolean isf=false;
		boolean iso=false;
		int t = 0;
		int lg = N.length();
	   
	    if(Integer.parseInt(N.substring(lg-1, lg)) % 2==0){
	    	iso = true;
	    	
	    }
	    for(int i=0;i<lg;i++){
	    	if(N.substring(i, i+1).equals("2")){
	    		t++;
	    	}
	    }
	    if(N.substring(0,1).equals("-")){
	    	isf = true;
	    	lg--;
	    }    
	    
	   
	    double r = t/(double)lg;
	   
	    if(isf){
	    	r = r*1.5;
	    }
	    if(iso){
	    	r = r*2;
	    }
	    r = (double)Math.round(r*10000)/100;
	  
	    DecimalFormat df=new DecimalFormat(".00");
	    String s1 = df.format(r);
	    if (s1.equals(".00")){
	    	s1 = "0.00";
	    }
	    System.out.print(s1+"%");

	}

}
L1-017. �����ж��

һ�������������ĳ̶ȡ�����Ϊ�������а���2�ĸ�������λ���ı�ֵ�����������Ǹ�������̶�����0.5����������Ǹ�ż������������1�����������֡�-13142223336���Ǹ�11λ����������3��2�������Ǹ�����Ҳ��ż���������ķ����̶ȼ���Ϊ��3/11*1.5*2*100%��ԼΪ81.82%��������������һ���������������ж���� 

 �����ʽ�� 

�����һ�и���һ��������50λ������N�� 

 �����ʽ�� 

��һ�������N�����ĳ̶ȣ�����С�������λ�� 
����������-13142223336

���������81.82%

