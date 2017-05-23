import java.util.Scanner;

class TestSelf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input you name here");
		String _name = sc.next();

		System.out.println("Please input you age here");
		int _age = sc.nextInt();

		System.out.println("Please input you gender here");
		String _sex = sc.next();

		System.out.println("The computer recorded that: ");
		System.out.println("You name is"+" "+_name);
		System.out.println("You age is"+" "+_age);
		System.out.println("You gender is"+" "+_sex);

		
	}
}
