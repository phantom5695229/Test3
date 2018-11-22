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
		System.out.println("����"+m+"Ԫ,�����"+card.getMoney()+"Ԫ");
	}
	public void spendMoney(double m) {
		double money = card.getMoney();
		if (m > money) {
			System.out.println("���㣡��");
		} else {
			card.setMoney(money-m);
			System.out.println("ȡ��"+m+"Ԫ�������"+card.getMoney()+"Ԫ");
		}
	}
	public void showDetails(){
		System.out.println("���ţ�"+card.getId());
		System.out.println("��"+card.getMoney());
		System.out.println("�����У�"+card.getBank());
	}

}
