import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

class MaxandMin {
	public static void main(String[] args) {
		System.out.println("请输入你要获得的随机数的范围0~：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] str=new int[50];
		for(int i= 0;i<50;i++){
			str[i]=(int)(n*Math.random());
		}
		Arrays.sort(str);		
		System.out.println("所产生随机数中最大的是："+str[str.length-1]);
		System.out.println("所产生随机数中最小的是："+str[0]);

	}
}
	





