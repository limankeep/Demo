//实现字符串的大小写转换
package NumberTwo;

public class UpAndLower {
	public static void mian(String[] args){//主方法的入口
		String str = new String("bac DEF");
		String newstr = str.toLowerCase();//使用toLowerCase实行小写转换
		String newstr2 = str.toUpperCase();//使用toUpperCase方法实行大写转换
		System.out.println(newstr);
		System.out.println(newstr2);
	}
}
