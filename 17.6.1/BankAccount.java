import java.util.Scanner;

class  BankAccount {
	float currentMoney; 

	public BankAccount(){
			this(10000);
		}
	public BankAccount(float Money){
		this.currentMoney=Money;
	}

	public void saveMoney(){
		System.out.println("��ǰ���Ϊ��"+currentMoney+"\n��������Ҫ��ֵ��������");

		Scanner sc = new Scanner(System.in);
		float addmoney=sc.nextFloat();
		currentMoney+=addmoney;
		System.out.println("��ֵ�����Ϊ��"+currentMoney);
	}
	public void drawMoney(){
		System.out.println("��ǰ���Ϊ��"+currentMoney+"\n��������Ҫȡ��������");
		Scanner sc = new Scanner(System.in);
		float drawmoney=sc.nextFloat();
		currentMoney-=drawmoney;
		System.out.println("��ǰ���Ϊ��"+currentMoney);
	}	
	public static void main(String[] args) {
		System.out.println("Wellcom to bank,Please select the operation you want: \n1����ѯ���\n2����Ǯ\n3��ȡǮ\n4���˳�\n���������Ĳ�����");

		Scanner sc = new Scanner(System.in);
		BankAccount ba= new BankAccount();
		int choose = sc.nextInt();
		switch (choose){
		case 1:
			System.out.println("ʣ�����Ϊ��"+ba.currentMoney);
		break;
		case 2:
			ba.saveMoney();
		break;
		case 3:
			ba.drawMoney();
		break;
		case 4:
			System.out.println("��ӭ�´ι��٣�");
		break;
		}
		
	}
}
	





