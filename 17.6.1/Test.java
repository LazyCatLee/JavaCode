import java.util.Scanner;
//�����ĳ�ʼ�����ڴ����
class Test {

	int x = getX();
	int y=2;
	public int getX(){
		System.out.println(x);
		System.out.println(y);
		return 1;
	}
	
	public static void main(String[] args) {
	Test t = new Test();
	System.out.println("X="+t.x);
	System.out.println("Y="+t.y);

	//Test ts = new Test();
	//System.out.println("Y="+ts.y);
	//.out.println("X="+ts.x);
	}

}
	





