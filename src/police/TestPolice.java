package police;

public class TestPolice {
	public static void main(String[] args) {
		Criminal c1 = new Criminal();
		c1.setName("李XX");
		c1.setCrime("偷窃");
		Criminal c2 = new Criminal();
		c2.setName("孙XX");
		c2.setCrime("杀人");
		Criminal c3 = new Criminal();
		c3.setName("高书记");
		c3.setCrime("贪污");
		Criminal c4 = new Criminal();
		c4.setName("王XX");
		c4.setCrime("抢劫");
		
		Court court = new Court();
		court.setCriminal(c2);
		
		Police p = new Police();
		p.setCourt(court);
		p.arrest();
	}
	
}
