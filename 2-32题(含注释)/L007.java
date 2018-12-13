import java.util.Scanner;
/*
 * 声明一个数组，长度为10，值按顺序对应"ling","yi","er","san","si","wu","liu","qi","ba","jiu"、
 * 这样，数组的下标就是对应整数的值
 * 循环读入每一个字符
 * 如果是 符号，输出 -
 * 否则，转换成整数，以它为下标，输出数组对应的值
 */
import java.util.Scanner;
public class L007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ary={"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
		Scanner sc = new Scanner(System.in);
		
		String szs = sc.nextLine();
		for(int i=0;i<szs.length();i++){
			String t = szs.substring(i,i+1);
			if(t.equals("-")){
				System.out.print("fu");
			}else{
				int idx = Integer.parseInt(t);
				System.out.print(ary[idx]);
			}
			if (i!=(szs.length()-1)){
				System.out.print(" ");
			}
		}

	}

}

L1-007. 念数字

输入一个整数，输出每个数字对应的拼音。当整数为负数时，先输出“fu”字。十个数字对应的拼音如下： 
0: ling
1: yi
2: er
3: san
4: si
5: wu
6: liu
7: qi
8: ba
9: jiu



输入格式： 

输入在一行中给出一个整数，如： 1234 。 

提示：整数包括负数、零和正数。 

 输出格式： 

在一行中输出这个整数对应的拼音，每个数字的拼音之间用空格分开，行末没有最后的空格。如 yi er san si。
输入样例：-600

输出样例：fu liu ling ling
