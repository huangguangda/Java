import java.util.ArrayList;
import java.util.Scanner;
/*
 * 从规则知道 划拳记录的四个数中，如果 数2=数1+数3，甲输，如果 数4 = 数1+数3，乙输。
 * 要注意的是同时赢，都不喝，同时输，都喝。同输，或者同赢，不管是否有人已经达到或者超过其酒量，都进入下一轮，都不会到。
 * 但是，只要有一轮只有一个人赢，那么就看看输的一方是否已经等于或者小于其最大能喝杯数，如果是，那么输的一方倒。
 * 
 */

public class L019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int a = A;
		int b = B;
	
		sc.nextLine();
		int count = sc.nextInt();
		sc.nextLine();
		ArrayList<String> rc =new ArrayList<String>();
		for(int i=0;i<count;i++){
			rc.add(sc.nextLine());
		}
		for(int i=0;i<count;i++){
			String s1 = rc.get(i).toString().split(" ")[0];
			String s2 = rc.get(i).toString().split(" ")[1];
			String s3 = rc.get(i).toString().split(" ")[2];
			String s4 = rc.get(i).toString().split(" ")[3];
			int k1 = Integer.parseInt(s1)+Integer.parseInt(s3);
			int A1 = Integer.parseInt(s2);
			int B1 = Integer.parseInt(s4);
			if((A1 == k1) && (B1 == k1)){
				A--;
				B--;
				continue;
			}
			else if((A1 != k1) && (B1 != k1)){
				continue;
			}
			if(A1 == k1){
				A--;
				if(A<=0){
					System.out.println("A");
					System.out.print(b-B);
					break;
				}
			}
			if(B1 == k1){
				B--;
				if(B<=0){
					System.out.println("B");
					System.out.print(a-A);
					break;
				}
			}
			
		}
		
			
		
		
		
	}

}
L1-019. 谁先倒

划拳是古老中国酒文化的一个有趣的组成部分。酒桌上两人划拳的方法为：每人口中喊出一个数字，同时用手比划出一个数字。如果谁比划出的数字正好等于两人喊出的数字之和，谁就输了，输家罚一杯酒。两人同赢或两人同输则继续下一轮，直到唯一的赢家出现。 

下面给出甲、乙两人的酒量（最多能喝多少杯不倒）和划拳记录，请你判断两个人谁先倒。

 输入格式： 

输入第一行先后给出甲、乙两人的酒量（不超过100的非负整数），以空格分隔。下一行给出一个正整数N（<=100），随后N行，每行给出一轮划拳的记录，格式为：

甲喊 甲划 乙喊 乙划

其中“喊”是喊出的数字，“划”是划出的数字，均为不超过100的正整数（两只手一起划）。 

 输出格式： 

在第一行中输出先倒下的那个人：A代表甲，B代表乙。第二行中输出没倒的那个人喝了多少杯。题目保证有一个人倒下。注意程序处理到有人倒下就终止，后面的数据不必处理。
输入样例：1 1
6
8 10 9 12
5 10 5 10
3 8 5 12
12 18 1 13
4 16 12 15
15 1 1 16

输出样例：A
1

