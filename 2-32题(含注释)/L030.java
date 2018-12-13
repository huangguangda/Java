import java.util.ArrayList;
import java.util.Scanner;
/*
 * 此题用了两个数组，一个是保存输入学生信息的数组S
 * 另外一个是保存后一半学生信息的动态数组，并且是倒序排列的S1。
 * 对于S，从第一个元素到其总元素的一半进行循环
 * 找到和第一个元素匹配的另一个元素。输出。并从动态数组S1中删除掉
 * 第第二个元素也进行相同的操作.....
 */

public class L030 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] S = new String[N];
		for (int i=0;i<N;i++){
			S[i] = sc.nextLine();
		}
		int d = N/2;
		ArrayList<String>S1 = new ArrayList<String>();
		for(int i=N-1;i>=d;i--){
			S1.add(S[i]);
		}
		for(int i=0;i<d;i++){
			String sex1 = S[i].split(" ")[0];
			String name1 = S[i].split(" ")[1];
			for(int j=0;j<S1.size();j++){
				String sex2 = S1.get(j).split(" ")[0]; 
				String name2 = S1.get(j).split(" ")[1];
				if(!sex2.equals(sex1)){
				   System.out.println(name1+" "+name2);
				   S1.remove(j);
				   break;
				}
			}
		}
		

	}

}
L1-030. 一帮一

“一帮一学习小组”是中小学中常见的学习组织方式，老师把学习成绩靠前的学生跟学习成绩靠后的学生排在一组。本题就请你编写程序帮助老师自动完成这个分配工作，即在得到全班学生的排名后，在当前尚未分组的学生中，将名次最靠前的学生与名次最靠后的异性学生分为一组。 

 输入格式： 

输入第一行给出正偶数N（<=50），即全班学生的人数。此后N行，按照名次从高到低的顺序给出每个学生的性别（0代表女生，1代表男生）和姓名（不超过8个英文字母的非空字符串），其间以1个空格分隔。这里保证本班男女比例是1:1，并且没有并列名次。 

 输出格式： 

每行输出一组两个学生的姓名，其间以1个空格分隔。名次高的学生在前，名次低的学生在后。小组的输出顺序按照前面学生的名次从高到低排列。 
输入样例：8
0 Amy
1 Tom
1 Bill
0 Cindy
0 Maya
1 John
1 Jack
0 Linda

输出样例：Amy Jack
Tom Linda
Bill Maya
Cindy John

