    /*
		��������һ�������������λ֮��

	*/

	import java.util.Scanner; 
    
    public class Test{
		static int sum=0;
        public static void main(String[] args){
			System.out.println("������һ������:");
			Scanner sc=new Scanner(System.in);
			int key= sc.nextInt();
			int j;

			
/*			
             String str=String.valueOf(key);
			 System.out.println(str);
			 sc.close();
			
             Scanner scanner=new Scanner(str); 
            int total=0; 
             while(scanner.hasNext()){ 
                 total+=scanner.nextInt(); 
          }
*/
			while (key!=0){
				j=key%10;
				key=key/10;
				sum+=j;

			
			}
          System.out.println("������֮��Ϊ��"+sum);           
		  sc.close(); 
      } 
 }