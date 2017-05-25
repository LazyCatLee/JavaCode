import java.util.Scanner;

class Score2 {
	public static void main(String[] args) {
		System.out.println("请输入成绩：");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		value=value/10;
		switch(value){
			case 9:
				System.out.println("A级");
			break;

			case 8:
				System.out.println("B级");
			break;

			case 7:
				System.out.println("C级");
			break;

			case 6:
				System.out.println("D级");
			break;

			default:
				System.out.println("E级");
		}		
	}
}
	





