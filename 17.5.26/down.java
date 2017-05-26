import java.util.Scanner;

class down {
	public static void main(String[] args) {

		System.out.println("Hello World!");
		double h= 100;
		int i=0;
		double s=0;
		for(i= 0;i<10;i++){
			    h/=2;
				s+=h;
				//System.out.println("第"+i+"次反弹高度为："+h+"m");
			}
		
		System.out.println("第10次反弹高度为："+h+"m");
		System.out.println("共经过"+s+"m");
	}
}
	





