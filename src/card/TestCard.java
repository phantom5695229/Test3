package card;

public class TestCard {
	public static void main(String[] args) {
		Card c1 = new Card();
		c1.setId("1111 2222 3333 4444 555");
		c1.setMoney(10000.0);
		c1.setBank("招商银行");
		Person p = new Person();
		p.setCard(c1);
		p.setName("小王");
		p.saveMoney(50000.0);
		p.spendMoney(60000.0);
		p.showDetails();
		
	}

}
