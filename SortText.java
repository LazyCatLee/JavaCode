/*
  ѡ�����򷨣�
  ��һ������Ϊi���������i�ı���
  ��һ�����������Ԫ�ز�����������ĵ�һ��Ԫ�ؽ���λ��
  �ڶ��α���������Ԫ����ڶ���Ԫ�ؽ��н�����

  ��˱���n���Ժ󣬽����е�Ԫ�شӴ�С�����г�����

*/

public class SortTest{
	public static void main(String[] args){
		int[] intarray = {1,34,45,67,65,23,6,676,56,5};
		int keyvalue;
		int index;
		int temp;

		System.out.println("����ǰ������Ԫ��");
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
		System.out.println("���������飺");
		for(int b:intarray){
			System.out.println(b+ " ");
		}
	}

}