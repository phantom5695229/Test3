package hard2;

public class TestDVD {
	public static void main(String[] args) {
		DVDManegement dm = new DVDManegement();
		DVD dvd1 = new DVD();
		dvd1.setName("毒液");
		dvd1.setType("SF");
		DVD dvd2 = new DVD();
		dvd2.setName("西虹市首富");
		dvd2.setType("喜剧");
		DVD dvd3 = new DVD();
		dvd3.setName("复仇者联盟");
		dvd3.setType("SF");
		DVD dvd4 = new DVD();
		dvd4.setName("遗传厄运");
		dvd4.setType("恐怖");
		
		dm.saveDvd(dvd1);
		dm.saveDvd(dvd4);
		dm.saveDvd(dvd3);
		dm.showDvd();
		dm.delDvd("遗传厄运");
		dm.showDvd();
		
		
	}

}
