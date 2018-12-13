import java.util.ArrayList;
import java.util.Scanner;
/*
 * 初始化一个布尔型数组P，共10万个元素，初始值默认是false;
 * 循环所有的朋友圈，把有朋友的id号作为P的下标，其对应的值置为true
 * 为了优化速度，如果读到有一个朋友圈的朋友人数为1，直接忽略，读下一个朋友圈
 * 对输入查找是否有朋友的每一个id，看看其id对应P下标是否为false，如实，那么输出此id，表示其没有朋友。
 * 如果所有人都有朋友，那么就输出No one is handsome
 */

public class L020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		boolean[]P = new boolean[100000];
		boolean hs = false;
		boolean first = true;
		for(int i=0;i<N;i++){
			int K = sc.nextInt();
			if (K==1){
				sc.nextLine();
				continue;				
			}else{
				for(int j=0;j<K;j++){
					int S = sc.nextInt();
					if(P[S]==false){
					   P[S] = true;					   
					}
					
				}
				sc.nextLine();
			}
		}
		
		int M = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<M;i++){
			int S=sc.nextInt();
			if(!P[S]){
				P[S]=true;
				hs = true;
				if (!first){
					System.out.print(" ");
				}
				if(first){
					first = false;
				}
				int x = 5-String.valueOf(S).length();
				for(int j=0;j<x;j++){
					System.out.print("0");
				}
				System.out.print(S);
				
			}
		}
		if(!hs){
			System.out.print("No one is handsome");
		}
	
		

	}

}
L1-020. 帅到没朋友

当芸芸众生忙着在朋友圈中发照片的时候，总有一些人因为太帅而没有朋友。本题就要求你找出那些帅到没有朋友的人。 

 输入格式： 

输入第一行给出一个正整数N（<=100），是已知朋友圈的个数；随后N行，每行首先给出一个正整数K（<=1000），为朋友圈中的人数，然后列出一个朋友圈内的所有人——为方便起见，每人对应一个ID号，为5位数字（从00000到99999），ID间以空格分隔；之后给出一个正整数M（<=10000），为待查询的人数；随后一行中列出M个待查询的ID，以空格分隔。 

注意：没有朋友的人可以是根本没安装“朋友圈”，也可以是只有自己一个人在朋友圈的人。虽然有个别自恋狂会自己把自己反复加进朋友圈，但题目保证所有K超过1的朋友圈里都至少有2个不同的人。

 输出格式： 

按输入的顺序输出那些帅到没朋友的人。ID间用1个空格分隔，行的首尾不得有多余空格。如果没有人太帅，则输出“No one is handsome”。 

注意：同一个人可以被查询多次，但只输出一次。
输入样例1：3
3 11111 22222 55555
2 33333 44444
4 55555 66666 99999 77777
8
55555 44444 10000 88888 22222 11111 23333 88888

输出样例1：10000 88888 23333

输入样例2：3
3 11111 22222 55555
2 33333 44444
4 55555 66666 99999 77777
4
55555 44444 22222 11111

输出样例2：No one is handsome

