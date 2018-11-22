package police;

import java.util.Random;

public class Police {
	Court court;
	public void setCourt(Court c){
		court = c;
	}
	public Court getCourt(){
		return court;
	}
	
	public void arrest(){
		Random rand = new Random();
		boolean arrest = rand.nextBoolean();
		
		if (arrest) {
			System.out.println("警察抓到了坏人");
			System.out.println("罪犯姓名:"+court.criminal.getName());
			System.out.println("罪行:"+court.criminal.getcrime());
			System.out.println(court.judge());
		}else {
			System.out.println("警察没有抓到"+court.criminal.getName());
		}
	}
	
}
