package ManagementPractice;

public class Management {
	//创建数组，开辟5个新的引用空间
	Video[] videos = new Video[5];
	//创建一个变量count用来统计实际的DVD数量
	int count = 0 ;
	//创建方法储存Video方法
	public void saveVideo(Video video) {
		//如果现在video个数小于数组videos的长度则存入video，大于等于则显示空间已满
		if (count < videos.length) {
			//将video属性写入数组，每写入一个就给计数变数count自增
			videos[count++] = video;
		} else {
			System.out.println("空间已满！");
		}
	}
	//创建删除video方法,用字符串，video名来匹配
	public void delVideo(String name) {
		//创建一个用来判断重复的位标：index，初始值-1
		int index = -1 ;
		//创建循环遍历现在储存好的video数组的每一个元素的name属性，与输入的name匹配来判断重复与否
		for (int i = 0 ; i < count ; i++) {
			if (videos[i].name.equals(name)) {
				//如果重复则把index赋值为i,作为删除的起点，并跳出循环
				index = i ;
				break;
			}
		}
		//如果index为-1则表示没有找到要删除的name,输出未找到，如果index为-1以外的值则表明找到了，进行删除操作
		if (-1 == index) {
			System.out.println("未找到匹配名称");
		} else {
			//创建循环开始删除操作，起点为index位标
			for (int i = index ; i < count - 1 ; i++){
				//从index位标开始，每个位标向前窜一位
				videos[i] = videos[i + 1];
				//由于删除了一个video，因此总个数减一
			}
			count--;
		}
		
	}
	
	//创建查询方法
	public void showVideo(){
		for (int i = 0 ; i < count ; i++) {
			System.out.println("片名："+videos[i].name+"|类别："+videos[i].type);
		}
	}

}
