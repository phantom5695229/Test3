package ManagementPractice;

public class TestVideo {
	public static void main(String[] args) {
		Management management = new Management();
		Video video1 = new Video();
		video1.setName("毒液");
		video1.setType("SF");
		Video video2 = new Video();
		video2.setName("复仇者联盟");
		video2.setType("SF");
		Video video3 = new Video();
		video3.setName("西虹市首富");
		video3.setType("喜剧");
		Video video4 = new Video();
		video4.setName("人民的名义");
		video4.setType("剧情");
		
		management.saveVideo(video1);
		management.saveVideo(video2);
		management.saveVideo(video3);
		management.saveVideo(video4);
		management.showVideo();
		System.out.println("-------------");
		management.delVideo("毒液");
		management.showVideo();
	}

}
