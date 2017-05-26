import java.util.Scanner;
class SumOfDay {
	public static void main(String[] args){
		System.out.println("请输入日期：（XXXX-XX-XX的形式）");
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		String[] str = data.split("-");
		int _year = Integer.parseInt(str[0]);
		int _month = Integer.parseInt(str[1]);
		int _day = Integer.parseInt(str[2]);
		SumOfDay.whatDay(_year,_month,_day);			
	}
	static void whatDay(int i,int j,int m){
		char[] monthDay = {31,0,31,30,31,30,31,31,30,31,30,31};
		int feb= 0;
		int allday= 0;
		if(i/4==0){
			feb=29;
		}
		else{
			feb=28;
		}
		switch(j){
			case 1:
				System.out.println("今天是第"+m+"天！");
			break;
			case 2:
				System.out.println("今天是第"+(monthDay[0]+m)+"天！");
			break;
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				for(int k = 0;k<j-1;k++){
				allday+=monthDay[k];
				}
				System.out.println("今天是第"+(allday+feb+m)+"天！");
				break;
			}
		}
	}