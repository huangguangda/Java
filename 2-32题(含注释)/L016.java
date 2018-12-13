import java.util.ArrayList;
import java.util.Scanner;
/*
 * 对入每一个输入的身份证号，
 * 检查前17个字符，是否为数字，如果不是数数字,那么此身份证号不合法，直接输出，继续检查下一个身份证号
 * 如果前17都是数字，那么把17个数的加权和加起来，对11去模。去以此模为下标的M数组的值。看其是否和第18位相等，如不等，表明不合法，输出，继续检查下一个身份证号
 */

public class L016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]q = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        char[]M ={'1','0','X','9','8','7','6','5','4','3','2'};
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String id;
        boolean allright=true;
        boolean isnum = true;
        sc.nextLine();
        ArrayList<String> lid = new ArrayList<String>();
        for(int i=0;i<N;i++){
        	lid.add(sc.nextLine());
        }
        for(int i=0;i<N;i++){
        	isnum = true;
        	id = lid.get(i).toString();
        	char[] cid = id.toCharArray();
        	int sum = 0;
        	for(int j=0;j<cid.length-1;j++){
        		if(cid[j]>='0' && cid[j]<='9'){
        			int  k = Integer.parseInt(String.valueOf(cid[j]));        		
        			sum = sum+k*q[j];
        		}else{
        			allright = false;
        			isnum = false;
        			break;
        		}
        		
        	}
        	if(isnum){
        		int Z = sum % 11;
        		char e = cid[cid.length-1];
        		if(e!=M[Z]){
        			allright = false;
        			System.out.println(id);
        		}
        	}else{
        		System.out.println(id);
        	}
        	
        	
        }
        if(allright){
        	System.out.print("All passed");
        }
	}

}
L1-016. 查验身份证

一个合法的身份证号码由17位地区、日期编号和顺序编号加1位校验码组成。校验码的计算规则如下： 

首先对前17位数字加权求和，权重分配为：{7，9，10，5，8，4，2，1，6，3，7，9，10，5，8，4，2}；然后将计算的和对11取模得到值Z；最后按照以下关系对应Z值与校验码M的值：

Z：0 1 2 3 4 5 6 7 8 9 10
 M：1 0 X 9 8 7 6 5 4 3 2 

现在给定一些身份证号码，请你验证校验码的有效性，并输出有问题的号码。

 输入格式： 

输入第一行给出正整数N（<= 100）是输入的身份证号码的个数。随后N行，每行给出1个18位身份证号码。 

 输出格式： 

按照输入的顺序每行输出1个有问题的身份证号码。这里并不检验前17位是否合理，只检查前17位是否全为数字且最后1位校验码计算准确。如果所有号码都正常，则输出“All passed”。 
输入样例1：4
320124198808240056
12010X198901011234
110108196711301866
37070419881216001X

输出样例1：12010X198901011234
110108196711301866
37070419881216001X

输入样例2：2
320124198808240056
110108196711301862

输出样例2：All passed

