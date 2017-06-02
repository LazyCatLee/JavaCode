package lee;
class TeacherJapan {

	private String name;
	private int group;

	public TeacherJapan(){
		name = "japanese";
		group = 2;
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
		System.out.println("打开日语书");
		System.out.println("读单词");
		System.out.println("知识点讲解");
		System.out.println("总结提问");	
	}
	public static void main(String[] args) {
		TeacherJapan t = new TeacherJapan();
		t.introduce();
		t.teach();
	}
}
	








