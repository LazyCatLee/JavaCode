import java.util.Scanner;

class  Circle {
		
	public static void main(String[] args) {
		System.out.println("请输入圆的半径：");
		Scanner sc = new Scanner(System.in);
		float r = sc.nextFloat();
		double PI=3.14;
		double s=PI*r*r;
		double c=2*PI*r;
		System.out.println("圆的半径R："+r);
		System.out.println("圆的面积为：S="+"PI*"+r+"="+s);
		System.out.println("圆的周长为：C="+"2*PI"+r+"="+c);


	}
}
