package ManagementPractice;

public class Management {
	//�������飬����5���µ����ÿռ�
	Video[] videos = new Video[5];
	//����һ������count����ͳ��ʵ�ʵ�DVD����
	int count = 0 ;
	//������������Video����
	public void saveVideo(Video video) {
		//�������video����С������videos�ĳ��������video�����ڵ�������ʾ�ռ�����
		if (count < videos.length) {
			//��video����д�����飬ÿд��һ���͸���������count����
			videos[count++] = video;
		} else {
			System.out.println("�ռ�������");
		}
	}
	//����ɾ��video����,���ַ�����video����ƥ��
	public void delVideo(String name) {
		//����һ�������ж��ظ���λ�꣺index����ʼֵ-1
		int index = -1 ;
		//����ѭ���������ڴ���õ�video�����ÿһ��Ԫ�ص�name���ԣ��������nameƥ�����ж��ظ����
		for (int i = 0 ; i < count ; i++) {
			if (videos[i].name.equals(name)) {
				//����ظ����index��ֵΪi,��Ϊɾ������㣬������ѭ��
				index = i ;
				break;
			}
		}
		//���indexΪ-1���ʾû���ҵ�Ҫɾ����name,���δ�ҵ������indexΪ-1�����ֵ������ҵ��ˣ�����ɾ������
		if (-1 == index) {
			System.out.println("δ�ҵ�ƥ������");
		} else {
			//����ѭ����ʼɾ�����������Ϊindexλ��
			for (int i = index ; i < count - 1 ; i++){
				//��indexλ�꿪ʼ��ÿ��λ����ǰ��һλ
				videos[i] = videos[i + 1];
				//����ɾ����һ��video������ܸ�����һ
			}
			count--;
		}
		
	}
	
	//������ѯ����
	public void showVideo(){
		for (int i = 0 ; i < count ; i++) {
			System.out.println("Ƭ����"+videos[i].name+"|���"+videos[i].type);
		}
	}

}
