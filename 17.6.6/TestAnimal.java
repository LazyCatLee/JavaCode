//不同包下面，不能继承父类的protected

class Animals {

	public String name;

	protected Animals(){
		this("动物");
		System.out.println(name);
	}
	protected Animals(String name){
		this.name = name;
	}
	public void fun(){
		System.out.println("吃");
	}
}
class Dog extends Animals{
	private String name;
	public Dog(){
		super("dog");//调用父类构造器
		System.out.println(name);//自己的mane属性没有输出,显示NULL
		System.out.println(super.name);//访问父类name属性
		name = "i am dog";
		System.out.println(name);
	}
	public void fun(){	
		System.out.println("汪汪");
	}
}
class Cat extends Animals{
	private String name;
	public Cat(){
		//初始化会调用父类构造器，显示父类属性”动物“
		name="cat";
		System.out.println(name);  //显示Cat属性cat
	}
	public void fun(){
		System.out.println("喵喵");
	}
}

public class TestAnimal{
	public void testAnimal(Animals animal){
		animal.fun();
	}
	public static void main(String[] args){
		TestAnimal ta = new TestAnimal();

		Animals dog = new Dog();
		ta.testAnimal(dog);
		System.out.println();
		
		Animals cat = new Cat();
		ta.testAnimal(cat);

	}


}
	

	





