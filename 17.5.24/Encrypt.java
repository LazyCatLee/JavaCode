import java.util.Scanner;

class Encrypt{
	public static void main(String[] args) {
		System.out.println("������ԭʼ���루4λ����������");
		Scanner sc = new Scanner(System.in);
		int oldKey = sc.nextInt();
		
		int thousandsNumble=oldKey/1000;//1357����1000��1
		//System.out.println(thousandsNumble);
		int hundredsNumble = (oldKey-thousandsNumble*1000)/100;//3
		//System.out.println(hundredsNumble);
		int tensNumble=((oldKey-thousandsNumble*1000)-(hundredsNumble*100))/10;//5
		//System.out.println(tensNumble);
		int singleNumble =(oldKey-thousandsNumble*1000)-(hundredsNumble*100)-(tensNumble*10);
		//System.out.println(singleNumble);

	    
		String tempSingle=String.valueOf((singleNumble+5)%10);
		String tempTens=String.valueOf((tensNumble+5)%10);
		String tempHundrends=String.valueOf((hundredsNumble+5)%10);
		String tempThousands=String.valueOf((thousandsNumble+5)%10);

		String temp =tempSingle+tempTens+tempHundrends+tempThousands;

		int newKey=Integer.parseInt(temp);
		

		System.out.println("���ܺ������Ϊ��"+newKey);
		
	}
}