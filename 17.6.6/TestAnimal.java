//��ͬ�����棬���ܼ̳и����protected

class Animals {

	public String name;

	protected Animals(){
		this("����");
		System.out.println(name);
	}
	protected Animals(String name){
		this.name = name;
	}
	public void fun(){
		System.out.println("��");
	}
}
class Dog extends Animals{
	private String name;
	public Dog(){
		super("dog");//���ø��๹����
		System.out.println(name);//�Լ���mane����û�����,��ʾNULL
		System.out.println(super.name);//���ʸ���name����
		name = "i am dog";
		System.out.println(name);
	}
	public void fun(){	
		System.out.println("����");
	}
}
class Cat extends Animals{
	private String name;
	public Cat(){
		//��ʼ������ø��๹��������ʾ�������ԡ����
		name="cat";
		System.out.println(name);  //��ʾCat����cat
	}
	public void fun(){
		System.out.println("����");
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
	

	





