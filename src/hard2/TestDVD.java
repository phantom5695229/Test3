package hard2;

public class TestDVD {
	public static void main(String[] args) {
		DVDManegement dm = new DVDManegement();
		DVD dvd1 = new DVD();
		dvd1.setName("��Һ");
		dvd1.setType("SF");
		DVD dvd2 = new DVD();
		dvd2.setName("�������׸�");
		dvd2.setType("ϲ��");
		DVD dvd3 = new DVD();
		dvd3.setName("����������");
		dvd3.setType("SF");
		DVD dvd4 = new DVD();
		dvd4.setName("�Ŵ�����");
		dvd4.setType("�ֲ�");
		
		dm.saveDvd(dvd1);
		dm.saveDvd(dvd4);
		dm.saveDvd(dvd3);
		dm.showDvd();
		dm.delDvd("�Ŵ�����");
		dm.showDvd();
		
		
	}

}
