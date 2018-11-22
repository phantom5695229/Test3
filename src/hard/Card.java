package hard;

public class Card {
	String cardId;
	String owner;
	double money;
	String bankName;
	String ID;
	
	public void setCard(String c){
		cardId = c;
	}
	public void setOwner(String o){
		owner = o;
	}
	public void setMoney( double m){
		money = m;
	}
	public void setBankName(String b){
		bankName = b;
	}
	public void setID(String id){
		ID = id;
	}
	public String getCard(){
		return cardId;
	}
	public String getOwner(){
		return owner;
	}
	public double getMoney(){
		return money;
	}
	public String getBankName(){
		return bankName;
	}
	public String getID(){
		return ID;
	}
}
