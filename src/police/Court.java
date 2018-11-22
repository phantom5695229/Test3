package police;

public class Court {
	Criminal criminal;
	public void setCriminal(Criminal c){
		criminal = c;
	}
	public Criminal getCriminal(){
		return criminal;
	}
	//在同一个方法内使用一个方法次数超过两次，多次使用同一个方法会在内存内开多个方法栈，会影响效率
	//因此在保证同一个方法的返回值都相同的情况下,
	//在一个方法内把值取一次后在使用(也就是设置一个变量把多次使用的方法值提取出来)
	public String judge(){
		String crime = criminal.getcrime();
		if (crime.equals("偷窃")) {
			return "依法判处有期徒刑1年";
		}else if (crime.equals("杀人")) {
			return "依法判处死刑";
		}else if (crime.equals("贪污")) {
			return "依法判处有期徒刑10年";
		}else {
			return "由于检察机关证据不足，无罪释放";
		}
/*		if (criminal.getcrime().equals("偷窃")) {
			return "依法判处有期徒刑1年";
		}else if (criminal.getcrime().equals("杀人")) {
			return "依法判处死刑";
		}else if (criminal.getcrime().equals("贪污")) {
			return "依法判处有期徒刑10年";
		}else {
			return "由于检察机关证据不足，无罪释放";
		}*/
	}
}
