import java.util.Scanner;

class BuyGift {
	static int value=0;
	public static void main(String[] args) {
		System.out.println("������ɼ���");
		Scanner sc = new Scanner(System.in);
		value = sc.nextInt();
		scoreJudge();	
	}
	static void scoreJudge(){
		if(value>=90&&value<100){
			System.out.println("�����");
		}else if(value>=80&&value<90){
		System.out.println("���ֻ�");
		}else if(value>=70&&value<80){
		System.out.println("�Դ��");
		}else if(value>=60&&value<70){
		System.out.println("�Դ��");
		}else{			
		System.out.println("��ѧϰ����");
		}
	}
}
	
