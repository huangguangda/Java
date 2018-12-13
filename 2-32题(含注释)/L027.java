import java.util.ArrayList;
import java.util.Scanner;
/*
 * 此题的难点是要对输入的电话号码进行到倒序排列，就从大到小排序。然后去掉重复的值
 * 具体实现算法
 * 1.读入的字符串转换成字符数组
 * 2.字符数组转换成整形数组，因为字符'0'的assii码为48，所以都减48
 * 3.使用冒泡算法，进行排序，结果倒序排列电话号码。得到数组p
 * 4.创建动态数组arr。目的是去掉p的重复值
 * 5.之后剩下的工作按照题目的规则做就ok了。
 */

public class L027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		int[] p = new int[11];
		for(int i=0;i<11;i++){
			p[i] = (int)s[i]-48;
		}
		int[]pp = new int[11];
		for(int i=0;i<11;i++){
			pp[i] = p[i];
		}
		for(int i=0;i<10;i++){
		   int t = p[i];
		   for(int j=i+1;j<11;j++){
			   if (t<p[j]){
				   p[i] = p[j];
				   p[j] = t;
				   t = p[i];
			   }
		   }
		}
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int tp = -1;
		for(int i=0;i<11;i++){
			if(p[i]!=tp){
				arr.add(p[i]);
				tp = p[i];
			}
		}
		int[]index = new int[11];
		int lg = arr.size();
        for(int i=0;i<11;i++){
        	int t = pp[i];
        	for(int j=0;j<lg;j++){
        		if(t==arr.get(j)){
        			index[i] = j;
        			break;
        		}
        	}
        }
        System.out.print("int[] arr = new int[]{");
        for(int i=0;i<lg;i++){
        	if(i>0){  
        		System.out.print(",");
        	 }
        	System.out.print(arr.get(i));
        }
        System.out.println("};");
        System.out.print("int[] index = new int[]{");
        for(int i=0;i<11;i++){
        	if(i>0){  
        		System.out.print(",");
        	 }
        	System.out.print(index[i]);
        }
        System.out.print("};");
	}

}
一时间网上一片求救声，急问这个怎么破。其实这段代码很简单，index数组就是arr数组的下标，index[0]=2 对应 arr[2]=1，index[1]=0 对应 arr[0]=8，index[2]=3 对应 arr[3]=0，以此类推…… 很容易得到电话号码是18013820100。 

本题要求你编写一个程序，为任何一个电话号码生成这段代码 —— 事实上，只要生成最前面两行就可以了，后面内容是不变的。 

 输入格式： 

输入在一行中给出一个由11位数字组成的手机号码。 

 输出格式： 

为输入的号码生成代码的前两行，其中arr中的数字必须按递减顺序给出。 
输入样例：18013820100

输出样例：int[] arr = new int[]{8,3,2,1,0};
int[] index = new int[]{3,0,4,3,1,0,2,4,3,4,4};

