

/*
1��ϵͳ���һ���������������һ��������
2���û�����������һ�����ε����ֱ�����һ��������
3�����߽��бȽϣ������ڣ����ж���Ϸʤ�������������������ʾ���󲢼���������Ϸ
4��ÿ����һ�αȽϣ��������ۼ�һ�Σ���Ϸʤ����������´���


*/

import java.util.Scanner;
import java.util.Random;


public class GuessSize{

	static int value;
	static int x;

	public void getRandom(){

		Random r = new Random();
		//����һ��0 ~ 100֮������������int����
		int value = r.nextInt(101);
		System.out.println(value);
		this.value=value;
	}
	public void getInput(){

		Scanner scanner = new Scanner(System.in);
		System.out.println("���������µ���ֵ��");
		int x = scanner.nextInt();
		System.out.println("���µ���ֵΪ��"+x);
		this.x=x;
	}

	public void compareSize(){

		int count=1;
		for(count=1;x!=value;count++){		
			if(x<value){
				System.out.println("�´��������µ���ֵ��С�������Ŭ����");
				}		
				else {
					System.out.println(" �´��������µ���ֵ�ϴ������Ŭ����")	;
				}
				getInput();
			}			
			System.out.println("�¶�������ϲ���ʤ����");
			System.out.println("Ŀ��������"+value+"  ��һ������"+count+"�Σ�");
			
		

		/*while(x!=value){
			System.out.println(x>value?"���´���,�����":"����С�ˣ������");
			getInput();
			count++;
		}
		System.out.println("�¶�������ϲ���ʤ����");
		System.out.println("Ŀ��������"+value+"  ��һ������"+count+"�Σ�");
		*/

	}


		

	public static void main(String[] args) {
		GuessSize gs = new GuessSize();
		gs.getRandom();
		gs.getInput();
		gs.compareSize();
	}
}
