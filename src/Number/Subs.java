//获取子字符串（获取字符串的指定部分）
package Number;

public class Subs {
	public static void main(String[] args){
		String str = "hello world";
		String substr = str.substring(0,3);
		String substr2 = str.substring(2);
		System.out.println(substr);
		System.out.println(substr2);
	}
}
