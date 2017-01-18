
public class Wordbook {
	public static void main(String[] args){//主方法入口
		String str = new String("b");
		String str2 = new String("a");//用于比较的三个字符串
		String str3 = new String("c");
		System.out.println(str+"compareTo\n"+str2+":"+str.compareTo(str2));//将str和str2比较的结果输出
		System.out.println(str+"compareTo\n"+str3+":"+str.compareTo(str3));//将str和str3比较的结果输出
	}
}
