import java.util.Scanner;

class BinDisplay {
	public static void main(String[] args) {
		System.out.println("������һ��������");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();		
		int sum;
		String result= "";
		for(int i=value;i>=1;i/=2){
			if(i%2==0){
				sum=0;
			}else{
				sum=1;
			}
			result+=sum;
		}
		System.out.println("��Ӧ�Ķ�������Ϊ��"+result);
	}
}
	





