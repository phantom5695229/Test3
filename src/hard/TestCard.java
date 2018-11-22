package hard;

public class TestCard {
	public static void main(String[] args) {
		Card c = new Card();
		c.setCard("1111 2222 3333 4444 555");
		c.owner = "ken";
		c.money = 10000;
		c.bankName = "½¨ÐÐ";
		c.ID = "220 111 2222 3333 4444";
		
		Person p = new Person();
		p.setCard(c);
		p.saveMoney(10000);
		p.spendMoney(5000); 
		p.showCard();
//		System.out.println(p.getCard().cardId);
	}

}
