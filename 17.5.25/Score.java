import java.util.Scanner;

class Score {
	static int value=0;
	public static void main(String[] args) {
		System.out.println("请输入成绩：");
		Scanner sc = new Scanner(System.in);
		value = sc.nextInt();
		scoreJudge();	
	}
	static void scoreJudge(){
		if(value>=90&&value<100){
			System.out.println("A级");
		}else if(value>=80&&value<90){
		System.out.println("B级");
		}else if(value>=70&&value<80){
		System.out.println("C级");
		}else if(value>=60&&value<70){
		System.out.println("D级");
		}else{			
		System.out.println("E级");
		}
	}
}
	





