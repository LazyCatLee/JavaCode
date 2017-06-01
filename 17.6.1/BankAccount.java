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
		System.out.println("当前余额为："+currentMoney+"\n请输入你要充值的数量：");

		Scanner sc = new Scanner(System.in);
		float addmoney=sc.nextFloat();
		currentMoney+=addmoney;
		System.out.println("充值后余额为："+currentMoney);
	}
	public void drawMoney(){
		System.out.println("当前余额为："+currentMoney+"\n请输入你要取的数量：");
		Scanner sc = new Scanner(System.in);
		float drawmoney=sc.nextFloat();
		currentMoney-=drawmoney;
		System.out.println("当前余额为："+currentMoney);
	}	
	public static void main(String[] args) {
		System.out.println("Wellcom to bank,Please select the operation you want: \n1、查询余额\n2、存钱\n3、取钱\n4、退出\n请输入您的操作：");

		Scanner sc = new Scanner(System.in);
		BankAccount ba= new BankAccount();
		int choose = sc.nextInt();
		switch (choose){
		case 1:
			System.out.println("剩余余额为："+ba.currentMoney);
		break;
		case 2:
			ba.saveMoney();
		break;
		case 3:
			ba.drawMoney();
		break;
		case 4:
			System.out.println("欢迎下次光临！");
		break;
		}
		
	}
}
	





