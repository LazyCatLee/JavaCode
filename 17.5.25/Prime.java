 import java.util.Scanner;
  
class Prime{
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("�����жϵ���");
        int a = s.nextInt();        
        for(int i=2 ; i<=a;i++){    
             if(a % i == 0&& i != a){   
				System.out.println("��������");
             break;
            }else if(i == a){
                System.out.println("������");       
            }
        }
    } 
}


