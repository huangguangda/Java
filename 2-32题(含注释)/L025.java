import java.util.Scanner;
/*
 * 此题要注意的是A可能没有输入，例如输了一个空格，然后加字符串
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
L1-025. 正整数A+B

本题的目标很简单，就是求两个正整数A和B的和，其中A和B都在区间[1,1000]。稍微有点麻烦的是，输入并不保证是两个正整数。 

 输入格式： 

输入在一行给出A和B，其间以空格分开。问题是A和B不一定是满足要求的正整数，有时候可能是超出范围的数字、负数、带小数点的实数、甚至是一堆乱码。 

注意：我们把输入中出现的第1个空格认为是A和B的分隔。题目保证至少存在一个空格，并且B不是一个空字符串。

 输出格式： 

如果输入的确是两个正整数，则按格式“A + B = 和”输出。如果某个输入不合要求，则在相应位置输出“?”，显然此时和也是“?”。 
输入样例1：123 456

输出样例1：123 + 456 = 579

输入样例2：22. 18

输出样例2：? + 18 = ?

输入样例3：-100 blabla bla...33

输出样例3：? + ? = ?

