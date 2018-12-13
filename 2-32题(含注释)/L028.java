import java.util.Scanner;


public class L028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int[]M = new int[N];
		for(int i=0;i<N;i++){
			M[i] = sc.nextInt();
			sc.nextLine();
		}
		
		for(int i=0;i<N;i++){
			int t = M[i];
			
			boolean is = true;
			if (t>3){
			 int l = (int)(Math.ceil(Math.sqrt(t)));
			for(int j=2;j<=l;j++){
				if(t % j==0){
					System.out.println("No");
					is =false;
					break;
				}
			}
			if(is){
				System.out.println("Yes");
			}
			}else{
				if(t==1){
					System.out.println("No");
				}else{
					System.out.println("Yes");
				}
			
			}
		}

	}

}
L1-028. 判断素数

本题的目标很简单，就是判断一个给定的正整数是否素数。 

 输入格式： 

输入在第一行给出一个正整数N（<=10），随后N行，每行给出一个小于231的需要判断的正整数。 

 输出格式： 

对每个需要判断的正整数，如果它是素数，则在一行中输出“Yes”，否则输出“No”。 
输入样例：2
11
111

输出样例：Yes
No

