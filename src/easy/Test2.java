package easy;
class Team{
	String name;
	Coach coach;
	Player[] player;
	public void printTeamDetails(Player[] players){
		System.out.println("�������"+name);
		System.out.println("--------------");
		System.out.println("��������"+coach.name);
		System.out.println("����:"+coach.nation);
		System.out.println("����:"+coach.age);
		System.out.println("--------------");
		for (Player p : players) {
			System.out.println("��Ա��:"+p.name);
			System.out.println("����:"+p.number);
			System.out.println();
		}
	}
}
class Coach{
	String name;
	String nation;
	int age;
}
class Player{
	String name;
	int number;
	public void setPlayer(String n,int num){
		name = n ;
		number = num ;
	}
}
public class Test2 {
	public static void main(String[] args) {
		Coach c = new Coach();
		c.name = "��˹�ض�";
		c.age = 59;
		c.nation = "�¹�";
		Player p1 = new Player();
		p1.setPlayer("������",1 );
		Player p2 = new Player();
		p2.setPlayer("������",3 );
		Player p3 = new Player();
		p3.setPlayer("��˧",4 );
		Player p4 = new Player();
		p4.setPlayer("��ͦ",8 );
		Player p5 = new Player();
		p5.setPlayer("��ҫ��",13 );
		Player p6 = new Player();
		p6.setPlayer("����ƽ",31 );
		Player p7 = new Player();
		p7.setPlayer("��̹",9 );
		Player p8 = new Player();
		p8.setPlayer("�����",36 );
		Player p9 = new Player();
		p9.setPlayer("��л��",30 );
		Player p10 = new Player();
		p10.setPlayer("����˹��",10 );
		Player p11 = new Player();
		p11.setPlayer("����˹��˹",28 );
		
		Player[] players = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11};
		
		Team t = new Team();
		t.name = "����һ��";
		t.coach = c;
		t.player = players;
		
		t.printTeamDetails(players);
	}
}
