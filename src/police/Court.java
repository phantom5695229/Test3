package police;

public class Court {
	Criminal criminal;
	public void setCriminal(Criminal c){
		criminal = c;
	}
	public Criminal getCriminal(){
		return criminal;
	}
	//��ͬһ��������ʹ��һ�����������������Σ����ʹ��ͬһ�����������ڴ��ڿ��������ջ����Ӱ��Ч��
	//����ڱ�֤ͬһ�������ķ���ֵ����ͬ�������,
	//��һ�������ڰ�ֵȡһ�κ���ʹ��(Ҳ��������һ�������Ѷ��ʹ�õķ���ֵ��ȡ����)
	public String judge(){
		String crime = criminal.getcrime();
		if (crime.equals("͵��")) {
			return "�����д�����ͽ��1��";
		}else if (crime.equals("ɱ��")) {
			return "�����д�����";
		}else if (crime.equals("̰��")) {
			return "�����д�����ͽ��10��";
		}else {
			return "���ڼ�����֤�ݲ��㣬�����ͷ�";
		}
/*		if (criminal.getcrime().equals("͵��")) {
			return "�����д�����ͽ��1��";
		}else if (criminal.getcrime().equals("ɱ��")) {
			return "�����д�����";
		}else if (criminal.getcrime().equals("̰��")) {
			return "�����д�����ͽ��10��";
		}else {
			return "���ڼ�����֤�ݲ��㣬�����ͷ�";
		}*/
	}
}
