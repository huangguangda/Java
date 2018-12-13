import java.util.Scanner;
/*
 * 此题的技巧是对输入的字符串，从第一个到最后一个进行统计
 * G有几个，P有几个，L有几个，T有几个
 * 然后从1到输入字符串的长度循环
 * 依次输出GPLT
 */

public class L023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String si= sc.nextLine();
		int G=0,P=0,L=0,T=0;
		char[] s = si.toCharArray();
		int lg = s.length;
		char t;
		for(int i=0;i<lg;i++){
			t = s[i];
			switch (t){
			    case 'G':
			    	G++;
			    	break;
			    case 'g':
			    	G++;
			    	break;
			    case 'P':
			    	P++;
			    	break;
			    case 'p':
			    	P++;
			    	break;
			    case 'L':
			    	L++;
			    	break;
			    case 'l':
			    	L++;
			    	break;
			    case 'T':
			    	T++;
			    	break;
			    case 't':
			    	T++;
			    	break;
			}
		}
		for(int k=0;k<lg;k++){
			if(k<G){
				System.out.print("G");
			}
			if(k<P){
				System.out.print("P");
			}
			if(k<L){
				System.out.print("L");
			}
			if(k<T){
				System.out.print("T");
			}
			
		}

	}

}
L1-023. 输出GPLT

给定一个长度不超过10000的、仅由英文字母构成的字符串。请将字符重新调整顺序，按“GPLTGPLT....”这样的顺序输出，并忽略其它字符。当然，四种字符（不区分大小写）的个数不一定是一样多的，若某种字符已经输出完，则余下的字符仍按GPLT的顺序打印，直到所有字符都被输出。

 输入格式： 

输入在一行中给出一个长度不超过10000的、仅由英文字母构成的非空字符串。 

 输出格式： 

在一行中按题目要求输出排序后的字符串。题目保证输出非空。
输入样例：pcTclnGloRgLrtLhgljkLhGFauPewSKgt

输出样例：GPLTGPLTGLTGLGLL

