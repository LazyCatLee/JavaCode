import java.util.Scanner;

class Count {
	private static int count_Num = 0;
	public Count(){
		this.count_Num++;
	}

	public static void main(String[] args) {
		Count c = new Count();
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		Count c4 = new Count();

		System.out.println("您在这个类中，一共创建了"+count_Num+"个对象");

	
	}
}
	





