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
		System.out.println("����:"+m+"Ԫ,"+"���:"+card.getMoney()+"Ԫ.");
	}
	public void spendMoney(double m){
		if (m < card.getMoney()) {
			double money = card.getMoney();
			card.setMoney(money - m);
			System.out.println("ȡ��:" + m + "Ԫ," + "���:" + card.getMoney() + "Ԫ.");
		} else {
			System.out.println("����");
		}
		
	}
	public void showCard(){
		System.out.println("���ţ�"+card.cardId);
		System.out.println("�ֿ��ˣ�"+card.owner);
		System.out.println("��"+card.getMoney());
		System.out.println("�����У�"+card.bankName);
		System.out.println("���֤��:"+card.ID);
	}

}
