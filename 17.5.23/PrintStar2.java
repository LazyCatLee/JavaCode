/*
   *  ��1��  �ո���3(4-1) ������1(1*2-1)
  ***  ��2��  �ո���2(4-2) ������3(2*2-1)
 *****  ��3��  �ո���1(4-3) ������5(3*2-1)
*******  ��4��  �ո���0(4-4) ������7(4*2-1) 
*/

class PrintStar2 {

public static void main(String[] args) {

		int m =7;
        for (int i = 0; i < m; i++) {
            int t =0; //t��������ž���߽���Ҫ���ٿո�
            if (i >= m / 2) {// >��mΪ����������µ��жϣ�=��mΪż��������µ��жϣ����ｫ�������Щiֵת��Ϊ�����ԳƵ�iֵ
                t = m - 1 - i;
            }else{
                t = i;
            }
            for (int j = 1; j <= m; j++) {
                if (j >= (m + 1) / 2 - t && j <= (m + 1) / 2 + t) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}


}
