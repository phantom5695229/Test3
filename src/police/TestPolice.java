package police;

public class TestPolice {
	public static void main(String[] args) {
		Criminal c1 = new Criminal();
		c1.setName("��XX");
		c1.setCrime("͵��");
		Criminal c2 = new Criminal();
		c2.setName("��XX");
		c2.setCrime("ɱ��");
		Criminal c3 = new Criminal();
		c3.setName("�����");
		c3.setCrime("̰��");
		Criminal c4 = new Criminal();
		c4.setName("��XX");
		c4.setCrime("����");
		
		Court court = new Court();
		court.setCriminal(c2);
		
		Police p = new Police();
		p.setCourt(court);
		p.arrest();
	}
	
}
