import java.util.Scanner;

class  Circle {
		
	public static void main(String[] args) {
		System.out.println("������Բ�İ뾶��");
		Scanner sc = new Scanner(System.in);
		float r = sc.nextFloat();
		double PI=3.14;
		double s=PI*r*r;
		double c=2*PI*r;
		System.out.println("Բ�İ뾶R��"+r);
		System.out.println("Բ�����Ϊ��S="+"PI*"+r+"="+s);
		System.out.println("Բ���ܳ�Ϊ��C="+"2*PI"+r+"="+c);


	}
}
