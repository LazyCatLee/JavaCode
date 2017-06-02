package lee;
class Teacher {

	private String name;
	private int group;

	public Teacher(){
		name = "xxx";
		group = 0;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setGroup(int group){
		this.group = group;
	}
	public int getGroup(){
		return this.group;
	}
	public void introduce(){
		name = getName();
		group = getGroup();
		System.out.println("姓名："+name+"	"+"小组"+group);
	}
	public void teach(){

		System.out.println("知识点讲解");
		System.out.println("总结提问");	
	}
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.introduce();
		t.teach();
	}
}

