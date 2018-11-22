package hard2;

public class DVDManegement {
	DVD[] dvds = new DVD[5];
	int count = 0 ;
	public void saveDvd(DVD dvd) {
		if (count < dvds.length) {
			dvds[count++] = dvd;
		} else {
			System.out.println("空间已满！！");
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
			System.out.println("未找到匹配标题");
		} else {
			for(int i = index ; i < count - 1; i++) {
				dvds[i] = dvds[i+1];
			}
			count--;
		}
		
	}
	public void showDvd(){
		for (int i = 0 ; i < count ; i++) {
			System.out.println("标题："+dvds[i].getName());
			System.out.println("类别："+dvds[i].getType());
		}
	}
	

}
