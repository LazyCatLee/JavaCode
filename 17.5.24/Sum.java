import java.util.Scanner;

class Sum{
	public static void main(String[] args) {
		System.out.println("请输入正整数(4位以内)：");
		Scanner sc = new Scanner(System.in);
		int oldKey = sc.nextInt();
		
		int thousandsNumble=oldKey/1000;//1357除以1000得1
		System.out.println(thousandsNumble);
		int hundredsNumble = (oldKey-thousandsNumble*1000)/100;//3
		System.out.println(hundredsNumble);
		int tensNumble=((oldKey-thousandsNumble*1000)-(hundredsNumble*100))/10;//5
		System.out.println(tensNumble);
		int singleNumble =(oldKey-thousandsNumble*1000)-(hundredsNumble*100)-(tensNumble*10);
		System.out.println(singleNumble);

	    
		//String tempSingle=String.valueOf(singleNumble+5);
		//String tempTens=String.valueOf(tensNumble+5);
		//String tempHundrends=String.valueOf(hundredsNumble+5);
		//String tempThousands=String.valueOf(thousandsNumble+5);

		//String temp = tempThousands+tempHundrends+tempTens+tempSingle;
		int temp=thousandsNumble+hundredsNumble+tensNumble+singleNumble;
	

		System.out.println("各数位之和为"+temp);
		
	}
}