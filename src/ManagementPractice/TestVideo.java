package ManagementPractice;

public class TestVideo {
	public static void main(String[] args) {
		Management management = new Management();
		Video video1 = new Video();
		video1.setName("��Һ");
		video1.setType("SF");
		Video video2 = new Video();
		video2.setName("����������");
		video2.setType("SF");
		Video video3 = new Video();
		video3.setName("�������׸�");
		video3.setType("ϲ��");
		Video video4 = new Video();
		video4.setName("���������");
		video4.setType("����");
		
		management.saveVideo(video1);
		management.saveVideo(video2);
		management.saveVideo(video3);
		management.saveVideo(video4);
		management.showVideo();
		System.out.println("-------------");
		management.delVideo("��Һ");
		management.showVideo();
	}

}
