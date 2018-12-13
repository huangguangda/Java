import java.util.Scanner;
/*
 * 读取填充后的字符串的最终长度N。
 * 读取字符串ts
 * 如果字符串ts长度lg大于N，直接截取最后N位长度子串输出。
 * 否则先输出lg-N个填充字符，再输出ts
 */

public class L032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		sc.nextLine();
		String ts = sc.nextLine();
		int lg = ts.length();
		if (N<=lg){
			String os = ts.substring(lg-N,lg);
			System.out.print(os);
		}else{
			int c = N-lg;
			for(int i=0;i<c;i++){
				System.out.print(s);
			}
			System.out.print(ts);
		}

	}

}
L1-032. Left-pad

根据新浪微博上的消息，有一位开发者不满NPM（Node Package Manager）的做法，收回了自己的开源代码，其中包括一个叫left-pad的模块，就是这个模块把javascript里面的React/Babel干瘫痪了。这是个什么样的模块？就是在字符串前填充一些东西到一定的长度。例如用“*”去填充字符串“GPLT”，使之长度为10，调用left-pad的结果就应该是“******GPLT”。Node社区曾经对left-pad紧急发布了一个替代，被严重吐槽。下面就请你来实现一下这个模块。 

 输入格式： 

输入在第一行给出一个正整数N（<=104）和一个字符，分别是填充结果字符串的长度和用于填充的字符，中间以1个空格分开。第二行给出原始的非空字符串，以回车结束。 

 输出格式： 

在一行中输出结果字符串。 
输入样例1：15 _
I love GPLT

输出样例1：____I love GPLT

输入样例2：4 *
this is a sample for cut

输出样例2： cut

