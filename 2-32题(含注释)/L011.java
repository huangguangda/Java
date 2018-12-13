import java.util.ArrayList;
import java.util.Scanner;
/*
 * ca为保存A第字符数组，cb为保存B的字符数组
 * 1.对ca数组的每一个字符，进行以下操作
 * 2.查找cb的每一个字符，如果存在相等的，则不输出此字符，直接跳回1
 * 3.如果都不等，就输出此字符，跳转到1
 */

public class L011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		
		char[] ca = a.toCharArray();
		char[] cb = b.toCharArray();
		
		int la = ca.length;
		int lb = cb.length;
		char t;
		boolean isin=false;
		
		for(int i=0;i<la;i++){
			t = ca[i];
			isin=false;
			for(int j=0;j<lb;j++){
				if(t==cb[j]){
					isin = true;
					break;
				}
			}
			if(!isin){
				System.out.print(t);
			}
		}
		

	}

}
L1-011. A-B

本题要求你计算A-B。不过麻烦的是，A和B都是字符串 —— 即从字符串A中把字符串B所包含的字符全删掉，剩下的字符组成的就是字符串A-B。

 输入格式： 

输入在2行中先后给出字符串A和B。两字符串的长度都不超过104，并且保证每个字符串都是由可见的ASCII码和空白字符组成，最后以换行符结束。 

 输出格式： 

在一行中打印出A-B的结果字符串。 
输入样例：I love GPLT!  It's a fun game!
aeiou

输出样例：I lv GPLT!  It's  fn gm!

