import java.util.Scanner;

class  SumOfArr{
	public static void main(String[] args) {
		int s = 0;
		int[][] b={{1,1,1},{21,22,23},{31,32,33}};
		System.out.println("�������£�");
		for(int i = 0;i<b.length;i++){
			for(int j = 0;j<b[i].length;j++){
				System.out.print(b[i][j]+"	");
				if(i==j){
					s+=b[i][j];
				}				
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
		System.out.println("����Խ���Ԫ��֮��Ϊ��"+s);
	}
}
	





