/*
  选择排序法：
  对一个长度为i的数组进行i的遍历
  第一遍遍历出最大的元素并将其与数组的第一个元素交换位置
  第二次遍历，最大的元素与第二个元素进行交换。

  如此遍历n次以后，将所有的元素从大到小就排列出来了

*/

public class SortTest{
	public static void main(String[] args){
		int[] intarray = {1,34,45,67,65,23,6,676,56,5};
		int keyvalue;
		int index;
		int temp;

		System.out.println("排序前的数组元素");
		for(int a : intarray){
			System.out.print(a+" ");
		}
		System.out.println("-----------------");
		for(int i = 0;i <intarray.length;i++){
			index=i;
			keyvalue=intarray[i];
			for(int j = i;j<intarray.length;j++){
				if(intarray[j]<keyvalue){
					index=j;
					keyvalue=intarray[j];
				}
			}
			temp=intarray[i];
			intarray[i]=intarray[index];
			intarray[index]=temp;
		}
		System.out.println("排序后的数组：");
		for(int b:intarray){
			System.out.println(b+ " ");
		}
	}

}