package lee;
class TeacherJava {

	private String name;
	private int group;

	public TeacherJava(){
		name = "java";
		group = 1;
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
		System.out.println("打开记事本");
		System.out.println("输入代码");
		System.out.println("知识点讲解");
		System.out.println("总结提问");
	}
	public static void main(String[] args) {
		TeacherJava t = new TeacherJava();
		t.introduce();
		t.teach();
	}
}
	





