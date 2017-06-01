
class computer {
	public String cpu="酷睿i7 6700" ;
	public int disk=1024;
	public int ram=8;		



	public void show(){
		computerDisplay();
	}
	public void show(boolean cpu,boolean ram,boolean disk){
		//注意if语句里的=和==的应用
		if(((cpu==true)&(ram==true))&(disk==true)){
			computerDisplay();

		}else if((cpu==true)&(ram==true)){
			cpuDisplay();
			ram();
		}else if((disk==true)&(ram==true)){
			diskDisplay();
			ram();
		}else if ((cpu==true)&(disk==true)){
			diskDisplay();
			cpuDisplay();
		}else if (cpu==true){
			cpuDisplay();
		}else if (ram==true){
			ram();
		
		}else if (disk==true){
			diskDisplay();
		}
			
		
	}


	public void cpuDisplay(){

		System.out.println("CPU: "+cpu);
	}
	public void diskDisplay(){
		System.out.println("硬盘: "+disk+"G");
	}
	public void ram(){
		System.out.println("内存： "+ram+"G");
	}
	public void computerDisplay(){
		cpuDisplay();
		diskDisplay();
		ram();
	}

	public static void main(String[] args) {

	
		computer cp = new computer();
		cp.show();

		System.out.println("-----------------");



		cp.show(false,true,true);


	
	
		
	}
}
	





