import java.util.Scanner;
/**
 * 
 * @author Administrator
 * 先定义一个整形数组，10个元素，0到9十个数出现的次数存放在对应下标的值上
 *从0到10进行循环，循环遍历为i
 *检索字符串，当前循环值i在字符串出现的次数，合计后放入 d[i]中
 *输出结果，如果大于0才输出
 */

public class L003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d = {0,0,0,0,0,0,0,0,0,0};
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		for(int i=0;i<10;i++){
			String D = String.valueOf(i);
			int j=0;
			int dcount = 0;
			while((N.indexOf(D,j)!=-1) && j<N.length()){
				dcount++;
				j = N.indexOf(D,j)+1;
			}
			d[i] = dcount;
		}
		for(int i=0;i<10;i++){
			if(d[i]>0){
				System.out.println(String.valueOf(i)+":"+String.valueOf(d[i]));
			}
		}

	}

}
L1-003. 个位数统计

给定一个k位整数N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)，请编写程序统计每种不同的个位数字出现的次数。例如：给定N = 100311，则有2个0，3个1，和1个3。

 输入格式： 

每个输入包含1个测试用例，即一个不超过1000位的正整数N。

 输出格式： 

对N中每一种不同的个位数字，以D:M的格式在一行中输出该位数字D及其在N中出现的次数M。要求按D的升序输出。
输入样例：100311

输出样例：0:2
1:3
3:1
