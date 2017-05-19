

/*
1、系统输出一个随机数并保存在一个变量中
2、用户命令行输入一个整形的数字保存在一个变量中
3、二者进行比较，若等于，则判定游戏胜利，若不等于则进行提示错误并继续进行游戏
4、每进行一次比较，计数器累加一次，游戏胜利则输出所猜次数


*/

import java.util.Scanner;
import java.util.Random;


public class GuessSize{

	static int value;
	static int x;

	public void getRandom(){

		Random r = new Random();
		//产生一个0 ~ 100之间的随机整数（int）。
		int value = r.nextInt(101);
		System.out.println(value);
		this.value=value;
	}
	public void getInput(){

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您猜的数值：");
		int x = scanner.nextInt();
		System.out.println("您猜的数值为："+x);
		this.x=x;
	}

	public void compareSize(){

		int count=1;
		for(count=1;x!=value;count++){		
			if(x<value){
				System.out.println("猜错啦！您猜的数值较小！请继续努力！");
				}		
				else {
					System.out.println(" 猜错啦！您猜的数值较大！请继续努力！")	;
				}
				getInput();
			}			
			System.out.println("猜对啦！恭喜获得胜利！");
			System.out.println("目标数字是"+value+"  您一共猜了"+count+"次！");
			
		

		/*while(x!=value){
			System.out.println(x>value?"您猜大了,请继续":"您猜小了，请继续");
			getInput();
			count++;
		}
		System.out.println("猜对啦！恭喜获得胜利！");
		System.out.println("目标数字是"+value+"  您一共猜了"+count+"次！");
		*/

	}


		

	public static void main(String[] args) {
		GuessSize gs = new GuessSize();
		gs.getRandom();
		gs.getInput();
		gs.compareSize();
	}
}
