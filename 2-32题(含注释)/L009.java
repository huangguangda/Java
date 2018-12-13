import java.util.Scanner;
/*
 * 依次读入每一个分数，并且每读入一个，加加一个。
 * 方法是每两个数的分母相乘做分母，最终结果为ib,分子分别乘以彼此的分母然后再相加最终结果为ia
 * 最终的相加结果为zs = ia/ib
 * 然后输出整数部分
 * 剩下的就是真小数，就是分母大于分子的数
 * 接下来，求分子分母的公因子，每求出一个，就分子分母同时除以此因子
 */
import java.util.Scanner;
public class L009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String a,b;
		long ia=0,ib=1,pa,pb;
		sc.nextLine();
		String str = sc.nextLine();
		String[] s= str.split(" ");
		for(int i=0;i<N;i++){
		
			a = s[i].split("/")[0];
			b = s[i].split("/")[1];
			pa = Integer.parseInt(a);
			pb = Integer.parseInt(b);
			pa = pa * ib;
			ia = ia * pb;
			ib = ib * pb;
			ia = ia + pa;
		}
		
		long zs = 0;
		zs = ia / ib;
		if (zs !=0){
			System.out.print(zs);
		}
		ia = ia - zs * ib;
		
		if(ia!=0){
		
		for(long i=2;i<=ia;i++){
			if(ia % i == 0 ){
				if(ib % i==0){
					ia = ia/i;
					ib = ib/i;
					i = 2;
				}
			}
		}
		if(zs!=0){
			System.out.print(" ");
		}
		System.out.print(ia+"/"+ib);
		}

	}

}
L1-009. N个数求和

本题的要求很简单，就是求N个数字的和。麻烦的是，这些数字是以有理数“分子/分母”的形式给出的，你输出的和也必须是有理数的形式。 

 输入格式： 

输入第一行给出一个正整数N（<=100）。随后一行按格式“a1/b1 a2/b2 ...”给出N个有理数。题目保证所有分子和分母都在长整型范围内。另外，负数的符号一定出现在分子前面。 

 输出格式： 

输出上述数字和的最简形式 —— 即将结果写成“整数部分 分数部分”，其中分数部分写成“分子/分母”，要求分子小于分母，且它们没有公因子。如果结果的整数部分为0，则只输出分数部分。 
输入样例1：5
2/5 4/15 1/30 -2/60 8/3

输出样例1：3 1/3

输入样例2：2
4/3 2/3

输出样例2：2

输入样例3：3
1/3 -1/6 1/8

输出样例3：7/24

