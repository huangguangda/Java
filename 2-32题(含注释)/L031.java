import java.util.Scanner;


public class L031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int iw,ih;
		String r="";
		double bw;
		for(int i=0;i<N;i++){
			ih = sc.nextInt();
		    iw = sc.nextInt();
		    bw = (ih - 100)*0.9*2;
		    double c = Math.abs(iw-bw)-bw*0.1;
		    if(c<0){
		    	r = r + "You are wan mei!\n";
		    }else if(iw>=bw){
		    	r = r + "You are tai pang le!\n";
		    }else{
		    	r = r + "You are tai shou le!\n";
		    }
		}
		System.out.print(r);

	}

}
L1-031. �����ǲ���̫����

��˵һ���˵ı�׼����Ӧ��������ߣ���λ�����ף���ȥ100���ٳ���0.9���õ��Ĺ���������ʵ�������׼���������10%���ڶ���������ģ��� |��ʵ����-��׼����| < ��׼����x10%������֪1�н�=0.5����ָ���һȺ�˵���ߺ�ʵ�����أ�������������Ƿ�̫�ֻ�̫���ˡ� 

 �����ʽ�� 

�����һ�и���һ��������N��<= 20�������N�У�ÿ�и��������������ֱ���һ���˵����H��120 < H < 200����λ�����ף�����ʵ����W��50 < W <= 300����λ���н������Կո�ָ��� 

 �����ʽ�� 

Ϊÿ�������һ�н��ۣ������������ģ������You are wan mei!�������̫���ˣ������You are tai pang le!�������������You are tai shou le!���� 
����������3
169 136
150 81
178 155

���������You are wan mei!
You are tai shou le!
You are tai pang le!

