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
		System.out.println("������"+name+"	"+"С��"+group);
	}
	public void teach(){
		System.out.println("�򿪼��±�");
		System.out.println("�������");
		System.out.println("֪ʶ�㽲��");
		System.out.println("�ܽ�����");
	}
	public static void main(String[] args) {
		TeacherJava t = new TeacherJava();
		t.introduce();
		t.teach();
	}
}
	





