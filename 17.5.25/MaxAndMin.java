import java.util.Scanner;

class MaxAndMin {
	public static void main(String[] args) {
/*		System.out.println("��������Ҫ��������ݸ�����");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =new int[n];
	
		System.out.println("����������:");
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length-1;j++){
			for(int i= 0;i<arr.length;i++){
				if(arr[j]>arr[i]){
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
					}		
				
				System.out.print(arr[i]);}
			}		
		System.out.println("�����ǣ�"+arr[arr.length-1]);
		System.out.println("��С���ǣ�"+arr[0]);
*/		
		Scanner sc = new Scanner(System.in);
		System.out.println("������������Ҫ�Ƚϵ����֣������0������");
		int num=sc.nextInt();
		//�����
		int max=num;
		//��С��
		int min=num;
		while(num!=0){
			max=max>num?max:num;
			min=min<num?min:num;
			num=sc.nextInt();
		}
		System.out.println("�������"+max);
		System.out.println("��С����"+min);
	}
}

	

	





