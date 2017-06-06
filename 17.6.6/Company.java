abstract class Positions{
	int salary;;
	Positions(){
		salary = 6000;
	}
	
	public abstract void salary();
}
class GeneralManager extends Positions{
	int salary;
	public GeneralManager(){
		//super();
		this.salary=super.salary;
		salary*=3;
	}
	
	public void salary(){
		System.out.println("总经理薪资:"+salary);
	}

}
class DepartmentManager extends Positions{
	int salary;
	public DepartmentManager(){
		this.salary =super.salary;
		salary*=2;
	}
	public void salary(){
		System.out.println("部门经理薪资:"+salary);
	}

}
class Workers extends Positions{
	int salary;
	public Workers(){
		this.salary =super.salary;
		
	}
	public void salary(){
		System.out.println("工人薪资:"+salary);
	}

}
public class Company{
	Positions p;

	public void getPosition(Positions p){
		this.p = p;
	}
	public void setPosition(Positions p){
		this.p = p;
	}
	public void DisSalary(){
		p.salary();
	}
	
	public static void main(String[] args){
	Company c = new Company();
	System.out.println();

	Positions gm = new GeneralManager();
	c.getPosition(gm);
	c.DisSalary();
	System.out.println();

	Positions dm = new DepartmentManager();
	c.getPosition(dm);
	c.DisSalary();
	System.out.println();

	Positions w = new Workers();
	c.getPosition(w);
	c.DisSalary();

	}
}
