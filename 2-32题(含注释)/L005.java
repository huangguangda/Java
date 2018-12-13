import java.util.ArrayList;
import java.util.Scanner;
/*
 * 循环读入考生的信息到字符串动态数组ks_inf
 * 读入要查询的考生数sh_num
 * 循环sh_num遍。读入每一个考试机号，查询数组ks_inf如果查到里面的考试机号相等，就输出相应的信息，
 * 为了提高速度，同时删除相应的数组元素
 * 
 */
L1-005. 考试座位号

每个PAT考生在参加考试时都会被分配两个座位号，一个是试机座位，一个是考试座位。正常情况下，考生在入场时先得到试机座位号码，入座进入试机状态后，系统会显示该考生的考试座位号码，考试时考生需要换到考试座位就座。但有些考生迟到了，试机已经结束，他们只能拿着领到的试机座位号码求助于你，从后台查出他们的考试座位号码。 

 输入格式： 

输入第一行给出一个正整数N（<=1000），随后N行，每行给出一个考生的信息：“准考证号 试机座位号 考试座位号”。其中准考证号由14位数字组成，座位从1到N编号。输入保证每个人的准考证号都不同，并且任何时候都不会把两个人分配到同一个座位上。 

考生信息之后，给出一个正整数M（<=N），随后一行中给出M个待查询的试机座位号码，以空格分隔。 

 输出格式： 

对应每个需要查询的试机座位号码，在一行中输出对应考生的准考证号和考试座位号码，中间用1个空格分隔。 
输入样例：4
10120150912233 2 4
10120150912119 4 1
10120150912126 1 3
10120150912002 3 2
2
3 4

输出样例：10120150912002 2
10120150912119 1


public class L005 {
	public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   int ks_num = sc.nextInt(); 
	   sc.nextLine();
	   ArrayList<String>ks_inf = new ArrayList<String>();
	   for(int i=0;i<ks_num;i++){
		  ks_inf.add(sc.nextLine());
	   }
	   
	   int sh_num; 
	   sh_num = sc.nextInt();
	   sc.nextLine();
	   String kh = "";
	   String r="";
	   for(int i=0;i<sh_num;i++){		  
		   kh = sc.next();
		   for(int j=0;j<ks_inf.size();j++){
			   String[]str = ks_inf.get(j).split(" ");
			   if(kh.equals(str[1])){
				   r = r+str[0]+" "+str[2]+"\n";
				   ks_inf.remove(j);
				   break;
			   }
		   }
	   }
	   System.out.print(r);
	}

}
