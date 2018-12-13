import java.util.Scanner;
/**
 * 
 * @author Administrator
 * 关键要求出第1行打几个符号。其他的行就可以根据它进行打印了
 * 下面的x就是表示第1行要打字符的个数，m表示上半边沙漏所有要打符好的个数（减1，不包括顶点）。
 * n表示输入的值，希望要打印符号的个数，当然，不一定能打完。因此，y表示剩下未打印符号的个数。
 * t表示每一行要打印符号的个数，每个一行，相差两个符号，因此t以2为单位递增或递减。
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
L1-002. 打印沙漏

本题要求你写个程序把给定的符号打印成沙漏的形状。例如给定17个“*”，要求按下列格式打印
*****
 ***
  *
 ***
*****


所谓“沙漏形状”，是指每行输出奇数个符号；各行符号中心对齐；相邻两行符号数差2；符号数先从大到小顺序递减到1，再从小到大顺序递增；首尾符号数相等。

给定任意N个符号，不一定能正好组成一个沙漏。要求打印出的沙漏能用掉尽可能多的符号。

 输入格式： 

输入在一行给出1个正整数N（<=1000）和一个符号，中间以空格分隔。 

 输出格式： 

首先打印出由给定符号组成的最大的沙漏形状，最后在一行中输出剩下没用掉的符号数。 
输入样例：19 *

输出样例：*****
 ***
  *
 ***
*****
2

