import java.util.Scanner;
import java.util.Arrays;

class  ArrPlus{
	public static void main(String[] args) {
    int[] oldArr ={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
	int h =0;
	int j=0;
	//Arrays.sort(oldArr);
	for(int i= 0;i<oldArr.length;i++){
		if(oldArr[i]==0){
			h++;
		}
	}
	int[] newArr = new int[oldArr.length-h];
	System.out.println("合并以后的数组为：");
	for(int i =0;i<oldArr.length;i++){
			if(oldArr[i]!=0){
				int temp=oldArr[i];
				newArr[j]=temp;
				
				System.out.print(newArr[j]+" ");
				j++;
			}else{
				i++;
			}		
		}
	System.out.println();
	}
}
	





