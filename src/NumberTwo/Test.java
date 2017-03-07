//IndexOf 和 lastIndexOf 的用法
package NumberTwo;

public class Test {
	public static void main(String[] args){//主方法的入口
		String str = "We are student";
		//将空字符串在str中的索引位置赋值给变量size
		int size = str.lastIndexOf("a");
		int bize = str.indexOf("a");
		//将变量size输出
		System.out.println("空字符串在字符串str中索引位置是："+size);
		//将字符串str的长度输出
		System.out.println("字符串str的长度是："+str.length());
		System.out.println("空字符串在字符串str中索引位置是："+bize);
		
	}
}
