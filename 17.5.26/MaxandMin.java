import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

class MaxandMin {
	public static void main(String[] args) {
		System.out.println("��������Ҫ��õ�������ķ�Χ0~��");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] str=new int[50];
		for(int i= 0;i<50;i++){
			str[i]=(int)(n*Math.random());
		}
		Arrays.sort(str);		
		System.out.println("������������������ǣ�"+str[str.length-1]);
		System.out.println("���������������С���ǣ�"+str[0]);

	}
}
	





