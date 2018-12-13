import java.util.Scanner;
/*
 * 读入A,B
 * 设置sum为0，作为连加结果存放变量
 * i从A到B循环
 * 把i转换成字符串，并求它的长度。然后用5减其长度得到差sp。输出sp个空格。输出i
 * 如果i对5取模等于0，换行
 * 如果最后一行不够5个字符，输出换行符
 * 输出连加结果
 */
import java.util.Scanner;
public class L008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = 0;
		int rcount = 0;
		for (int i=A;i<=B;i++){
			sum+=i;
			String s = String.valueOf(i);
			int sp = 5-s.length();
			for(int j=1;j<=sp;j++){
				System.out.print(" ");				
			}
			System.out.print(s);
			rcount++;
			if(rcount % 5 ==0){
				System.out.print("\n");
			}
		}
		if((B-A+1) % 5 !=0){
			System.out.print("\n");
		}
		System.out.print("Sum = "+sum);

	}

}
L1-008. 求整数段和

给定两个整数A和B，输出从A到B的所有整数以及这些数的和。

 输入格式： 

输入在一行中给出2个整数A和B，其中-100<=A<=B<=100，其间以空格分隔。 

 输出格式： 

首先顺序输出从A到B的所有整数，每5个数字占一行，每个数字占5个字符宽度，向右对齐。最后在一行中输出全部数字的和。 
输入样例：-3 8

输出样例：   -3   -2   -1    0    1
    2    3    4    5    6
    7    8
Sum = 30
