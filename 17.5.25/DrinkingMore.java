import java.util.Scanner;

class DrinkingMore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ӵ�еĽ�Ǯ��");
		int money = sc.nextInt();
		int num=0;

		while(money/3!=0){
			num+=money/3;
			money=money/3+money%3;
		}
		System.out.println("����ܺ�"+num+"ƿ����");
	}

}
	





