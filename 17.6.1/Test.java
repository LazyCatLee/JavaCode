import java.util.Scanner;

class Test {

	int x = getX();
	
	public int getX(){
		System.out.println("初始化先执行");
		return 1;
	}
	int y=1;
	public static void main(String[] args) {
	Test t = new Test();
	System.out.println("X="+t.x);
	System.out.println("Y="+t.y);

	Test ts = new Test();
	System.out.println("Y="+ts.y);
	System.out.println("X="+ts.x);
	}

}
	





