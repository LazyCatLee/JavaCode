import java.util.Scanner;

class Score2 {
	public static void main(String[] args) {
		System.out.println("������ɼ���");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		value=value/10;
		switch(value){
			case 9:
				System.out.println("A��");
			break;

			case 8:
				System.out.println("B��");
			break;

			case 7:
				System.out.println("C��");
			break;

			case 6:
				System.out.println("D��");
			break;

			default:
				System.out.println("E��");
		}		
	}
}
	





