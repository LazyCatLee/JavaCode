import java.util.Scanner;

class SumOfScore {
	public static void main(String[] args) {
		int[] arr =new int[5];
		int sum=0;
		System.out.println("������5���˵ĳɼ�:");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("�ɼ�֮��Ϊ��"+sum);
	}
}
	





