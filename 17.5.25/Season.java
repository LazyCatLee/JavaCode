import java.util.Scanner;

class Season  {
	
	public static void main(String[] args) {
		System.out.println("请输入月份：");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		value = value/3+1;
		Season s = new Season();
		
		String[] spring ={"马耳春风","万古长春","皮里春秋" ,"鸟语花香","柳暖花春","一室生春","大地春回","富于春秋","春生秋杀","春去秋来"};
		String[] summer = {"夏阳酷暑","夏山如碧","夏树苍翠","夏水汤汤","沉李浮瓜","官张火伞","赤时当空","炎天暑月","暑气蒸人"};
		String[] fall = {"春华秋实","千秋万代","秋高气爽","一叶知秋","明察秋毫","平分秋色","社燕秋鸿","望穿秋水","华屋秋墟"};
		String[] winter = {"寒冬腊月","冬山如睡","冬裘夏葛","冬日黑裘","夏裘冬葛","冬烘学究","冬月无复衣","数九寒冬","一日之冬","冬日之温","无间冬夏","秋收冬藏","冬日之阳","冬日夏云"};
	

		switch(value){
			case 1:
				System.out.println("春");
				s.seasonDis(spring);
				break;
			case 2:
				System.out.println("夏");
				s.seasonDis(summer);
				break;
			case 3:
				System.out.println("秋");
				s.seasonDis(fall);
				break;
			case 4:
				System.out.println("冬");
				s.seasonDis(winter);
				break;
		}
	}
	public void seasonDis(String[] str){
		
		
		for(int x=(int)(Math.random()*5);x<str.length;x++){
			System.out.print(str[x]+" ");
		}
	}
}
	





