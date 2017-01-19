//用trim()去掉字符串前面和尾部的空格
package Number;

public class Blak {
	public static void main(String[] args){//主方法的入口
		String str ="  Java  class  ";//定义一个字符串str
		System.out.println("字符串原来的长度："+str.length());//输出字符串原来的长度
		System.out.println("去掉空格后的长度："+str.trim().length());//输出字符串使用trim以后的长度
	}
}
