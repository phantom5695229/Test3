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
			System.out.println("����ץ���˻���");
			System.out.println("�ﷸ����:"+court.criminal.getName());
			System.out.println("����:"+court.criminal.getcrime());
			System.out.println(court.judge());
		}else {
			System.out.println("����û��ץ��"+court.criminal.getName());
		}
	}
	
}
