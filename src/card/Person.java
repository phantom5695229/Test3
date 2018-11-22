package card;

public class Person {
	String name;
	Card card;
	public void setName(String n) {
		name = n ;
	}
	public void setCard(Card c) {
		card = c ;
	}
	public String getName() {
		return name;
	}
	public Card getCard() {
		return card;
	}
	
	public void saveMoney(double m) {
		double money = card.getMoney();
		card.setMoney(money+m);
		System.out.println("存入"+m+"元,现余额"+card.getMoney()+"元");
	}
	public void spendMoney(double m) {
		double money = card.getMoney();
		if (m > money) {
			System.out.println("余额不足！！");
		} else {
			card.setMoney(money-m);
			System.out.println("取出"+m+"元，现余额"+card.getMoney()+"元");
		}
	}
	public void showDetails(){
		System.out.println("卡号："+card.getId());
		System.out.println("余额："+card.getMoney());
		System.out.println("开户行："+card.getBank());
	}

}
