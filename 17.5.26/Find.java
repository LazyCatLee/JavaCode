import java.util.Scanner;
import java.util.Arrays;


class  Find{
	public static void main(String[] args) {
		System.out.println("��������Ҫ��ѯ�ĵ��ʣ�");
		Scanner sc = new Scanner(System.in);
		String value = sc.next();
		String [] str= {"one","two","three","four","five","six","seven","eight","nine","ten"};
		for(int i = 0;i<str.length;i++){
			if(str[i].equals(value)){
				System.out.println("Yes!");
				return;
			}		
		}System.out.println("No!");
	}
}
	





