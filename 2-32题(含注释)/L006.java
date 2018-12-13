import java.util.ArrayList;
import java.util.Scanner;
/*
 * 求一个数的因子可以从用此数对从2到到这个数的平方根一个个去余数，如果余数为0，说明是因子
 * l是N的平方根向上取整的结果
 * 具体的算法思想为
 * c以1递增，不断测试每一个数是否为因子
 * s,e作为标记，s是标记开始，e是当前测试的结束，
 * min表示连续因子的最小值，max表示连续因子的最大值
 * s,e,c,min,max初始值为2.count表示连续因子的长度，初始值为1
 * 1.判断c是否是因子
 * 2.如果是，表示有可能是连续因子的组成部分，e就等于c,c加1。如不是，转4
 * 3.如果这时候c>l表示已经到了测试值的最大范围，退出循环。并且，看看当前的连续范围是否是
 * 最大的，如果是，那么min,和max分别赋值s,和e。如果c<=l继续循环，转1
 * 4.如果考试和结束标记e和s之差大于count，那么count等于e-s，并且，那么min,和max分别赋值s,和e。
 * c增加1，继续循环，转1
 * 
 */
L1-006. 连续因子

一个正整数N的因子中可能存在若干连续的数字。例如630可以分解为3*5*6*7，其中5、6、7就是3个连续的数字。给定任一正整数N，要求编写程序求出最长连续因子的个数，并输出最小的连续因子序列。

 输入格式： 

输入在一行中给出一个正整数N（1<N<231）。 

 输出格式： 

首先在第1行输出最长连续因子的个数；然后在第2行中按“因子1*因子2*……*因子k”的格式输出最小的连续因子序列，其中因子按递增顺序输出，1不算在内。
输入样例：630

输出样例：3
5*6*7



public class L006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ary = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int l = (int)Math.ceil(Math.sqrt(N));
		int s=2,e=2,c=2,min=2,max=2;
		boolean is = true;
		int count =1;
		while(s<=l){
			if(N % c ==0){
				is = false;
				e = c;
				c++;
				if(c>l){
					if(count<(e-s+1)){
						count = e -s +1;
						min = s;
						max = e;
					}
					break;					
				}
				
			}else{
				if(count<(e-s+1)){
					count = e -s +1;
					min = s;
					max = e;
				}
				s = ++c;				
			}
		}
		
		if(min==max){
			System.out.println(1);
			if(!is){
				System.out.print(min);
			}else{
				System.out.print(N);
			}
			
		}else{	
		
			System.out.println(count);
			for(int i=min;i<=max;i++){
				System.out.print(i);
				if(i!=max){
					System.out.print("*");
				}
			}
		
		}

	}

}
