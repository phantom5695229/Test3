package hard2;

public class DVDManegement {
	DVD[] dvds = new DVD[5];
	int count = 0 ;
	public void saveDvd(DVD dvd) {
		if (count < dvds.length) {
			dvds[count++] = dvd;
		} else {
			System.out.println("�ռ���������");
		}
	}
	public void delDvd(String name) {
		int index = -1 ;
		for (int i = 0 ; i < count ; i++) {
			if (dvds[i].getName().equals(name)) {
				index = i ;
				break;
			}
		}
		if (-1 == index) {
			System.out.println("δ�ҵ�ƥ�����");
		} else {
			for(int i = index ; i < count - 1; i++) {
				dvds[i] = dvds[i+1];
			}
			count--;
		}
		
	}
	public void showDvd(){
		for (int i = 0 ; i < count ; i++) {
			System.out.println("���⣺"+dvds[i].getName());
			System.out.println("���"+dvds[i].getType());
		}
	}
	

}
