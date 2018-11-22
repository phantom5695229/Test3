package easy;
class Team{
	String name;
	Coach coach;
	Player[] player;
	public void printTeamDetails(Player[] players){
		System.out.println("球队名："+name);
		System.out.println("--------------");
		System.out.println("教练名："+coach.name);
		System.out.println("国籍:"+coach.nation);
		System.out.println("年龄:"+coach.age);
		System.out.println("--------------");
		for (Player p : players) {
			System.out.println("球员名:"+p.name);
			System.out.println("号码:"+p.number);
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
		c.name = "舒斯特尔";
		c.age = 59;
		c.nation = "德国";
		Player p1 = new Player();
		p1.setPlayer("张羽中",1 );
		Player p2 = new Player();
		p2.setPlayer("单鹏飞",3 );
		Player p3 = new Player();
		p3.setPlayer("李帅",4 );
		Player p4 = new Player();
		p4.setPlayer("朱挺",8 );
		Player p5 = new Player();
		p5.setPlayer("王耀鹏",13 );
		Player p6 = new Player();
		p6.setPlayer("杨善平",31 );
		Player p7 = new Player();
		p7.setPlayer("盖坦",9 );
		Player p8 = new Player();
		p8.setPlayer("董瀚麟",36 );
		Player p9 = new Player();
		p9.setPlayer("穆谢奎",30 );
		Player p10 = new Player();
		p10.setPlayer("卡拉斯科",10 );
		Player p11 = new Player();
		p11.setPlayer("利亚斯科斯",28 );
		
		Player[] players = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11};
		
		Team t = new Team();
		t.name = "大连一方";
		t.coach = c;
		t.player = players;
		
		t.printTeamDetails(players);
	}
}
