import java.util.Scanner;

class ReverseOrder {
	public static void main(String[] args) {

		int[] arr={1,2,3,4,5,6,7,8,9,10};

		int[] arr2=new int[arr.length];
		System.out.println("ÄæĞòºó£º");
		for(int i = 0;i<arr.length;i++){
			int value = arr[arr.length-(i+1)];  
                arr2[i] = value;  
            System.out.print(arr2[i]+"  "); 
			}
	}

}
	





