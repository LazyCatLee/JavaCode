import java.util.Scanner;

class Season  {
	
	public static void main(String[] args) {
		System.out.println("�������·ݣ�");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		value = value/3+1;
		Season s = new Season();
		
		String[] spring ={"�������","��ų���","Ƥ�ﴺ��" ,"���ﻨ��","��ů����","һ������","��ش���","���ڴ���","������ɱ","��ȥ����"};
		String[] summer = {"��������","��ɽ���","�����Դ�","��ˮ����","�����","���Ż�ɡ","��ʱ����","��������","��������"};
		String[] fall = {"������ʵ","ǧ�����","�����ˬ","һҶ֪��","�������","ƽ����ɫ","�������","������ˮ","��������"};
		String[] winter = {"��������","��ɽ��˯","�����ĸ�","���պ���","���ö���","����ѧ��","�����޸���","���ź���","һ��֮��","����֮��","�޼䶬��","���ն���","����֮��","��������"};
	

		switch(value){
			case 1:
				System.out.println("��");
				s.seasonDis(spring);
				break;
			case 2:
				System.out.println("��");
				s.seasonDis(summer);
				break;
			case 3:
				System.out.println("��");
				s.seasonDis(fall);
				break;
			case 4:
				System.out.println("��");
				s.seasonDis(winter);
				break;
		}
	}
	public void seasonDis(String[] str){
		
		
		for(int x=(int)(Math.random()*5);x<str.length;x++){
			System.out.print(str[x]+" ");
		}
	}
}
	





