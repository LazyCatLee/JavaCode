import java.util.Scanner;

class SumOfScore {
	public static void main(String[] args) {
		int[] arr =new int[5];
		int sum=0;
		System.out.println("请输入5个人的成绩:");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("成绩之和为："+sum);
	}
}
	





