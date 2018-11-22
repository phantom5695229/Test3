package hard;

public class Person {
	Card card;
	public void setCard(Card c){
		card = c;
	}
	public Card getCard(){
		return card;
	}
	public void saveMoney(double m){
		double money = card.getMoney();
		card.setMoney(money+m);
		System.out.println("存入:"+m+"元,"+"余额:"+card.getMoney()+"元.");
	}
	public void spendMoney(double m){
		if (m < card.getMoney()) {
			double money = card.getMoney();
			card.setMoney(money - m);
			System.out.println("取出:" + m + "元," + "余额:" + card.getMoney() + "元.");
		} else {
			System.out.println("余额不足");
		}
		
	}
	public void showCard(){
		System.out.println("卡号："+card.cardId);
		System.out.println("持卡人："+card.owner);
		System.out.println("余额："+card.getMoney());
		System.out.println("开卡行："+card.bankName);
		System.out.println("身份证号:"+card.ID);
	}

}
