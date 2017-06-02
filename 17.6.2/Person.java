import java.util.Scanner;

class Person {
	private String name;
	private int high;
	private int age;
	private float wight;

	public Person(){


	}

	public void setName(String name){
		this.name = name;

	}
	public void getName(String name){
		this.name = name;
	}

	public void setHigh(int high){
		this.high = high;
	}
	public void getHigh(int high){
		this.high = high;
	}

	public void setAge(int age){
		this.age = age;
	}
	public void getAge(int age){
		this.age = age;
	}

	public void setWight(float wight){
		this.wight = wight;
	}
	public void getWight(float wight){
		this.wight = wight;
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Tom");
		p.setAge(22);
		p.setHigh(175);
		p.setWight (68);

		System.out.println("您刚才添加的是：\n"+p.name+"\n年龄"+p.age);
	}
}
	





