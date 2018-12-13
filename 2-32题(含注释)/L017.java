import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * 如果N为偶数，那么N %2 等于0，那么iso为true
 * 计算N包含几个2，放入t
 * 看看N是否是负数，如是，isf为true
 * 最后，按照规则，使用t除以N的长度，如果是负数，再乘以1.5，如果是....
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
L1-017. 到底有多二

一个整数“犯二的程度”定义为该数字中包含2的个数与其位数的比值。如果这个数是负数，则程度增加0.5倍；如果还是个偶数，则再增加1倍。例如数字“-13142223336”是个11位数，其中有3个2，并且是负数，也是偶数，则它的犯二程度计算为：3/11*1.5*2*100%，约为81.82%。本题就请你计算一个给定整数到底有多二。 

 输入格式： 

输入第一行给出一个不超过50位的整数N。 

 输出格式： 

在一行中输出N犯二的程度，保留小数点后两位。 
输入样例：-13142223336

输出样例：81.82%

