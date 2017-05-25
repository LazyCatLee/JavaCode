 import java.util.Scanner;
  
class Prime{
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("输入判断的数");
        int a = s.nextInt();        
        for(int i=2 ; i<=a;i++){    
             if(a % i == 0&& i != a){   
				System.out.println("不是素数");
             break;
            }else if(i == a){
                System.out.println("是素数");       
            }
        }
    } 
}


