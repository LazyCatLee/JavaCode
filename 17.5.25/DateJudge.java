import java.util.Scanner;

class DateJudge {
	public static void main(String[] args) {
		System.out.println("���������ڵ�Ӣ�ĵ��ʣ�");
		Scanner sc = new Scanner(System.in);
		String value = sc.next();
		
			char[] arr = value.toCharArray();
			if(arr[0]=='M'||arr[0]=='m'){
				System.out.println("����һ");
			}else if(arr[0]=='W'||arr[0]=='w'){
				System.out.println("������");
				}else if(arr[0]=='F'||arr[0]=='f'){
				System.out.println("������");
				}else if(arr[0]=='T'||arr[0]=='t'){
					if(arr[1]=='u'){
						System.out.println("������");
					}else if(arr[1]=='h'){
						System.out.println("���ڶ�");
					}
				}else if(arr[0]=='S'||arr[0]=='s'){
					if(arr[1]=='a'){
						System.out.println("������");
						}else if(arr[1]=='u'){
							System.out.println("������");
						}
				}
	}
}
	





