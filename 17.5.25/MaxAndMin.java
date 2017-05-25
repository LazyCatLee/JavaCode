import java.util.Scanner;

class MaxAndMin {
	public static void main(String[] args) {
/*		System.out.println("请输入您要处理的数据个数：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =new int[n];
	
		System.out.println("请输入数据:");
		
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
		System.out.println("最大的是："+arr[arr.length-1]);
		System.out.println("最小的是："+arr[0]);
*/		
		Scanner sc = new Scanner(System.in);
		System.out.println("请依次输入你要比较的数字，最后以0结束：");
		int num=sc.nextInt();
		//最大数
		int max=num;
		//最小数
		int min=num;
		while(num!=0){
			max=max>num?max:num;
			min=min<num?min:num;
			num=sc.nextInt();
		}
		System.out.println("最大数："+max);
		System.out.println("最小数："+min);
	}
}

	

	





