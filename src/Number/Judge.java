//正则匹配邮箱格式
package Number;

public class Judge {
	public static void main(String[] args){//主方法入口
		String regex = "\\w+(\\.\\w)*@\\w+(\\.\\w{2,3}){1,3}";//设定好需要匹配的字符串格式
		String str1 = "aaaa0@";
		String str2 = "aaaaaa";
		String str3 = "111@dsssssad.dda.com";
		/*开始根据各处的字符串来匹配*/
		if (str1.matches(regex)){
			System.out.println(str1+"是一个合法的电子邮箱字符格式");
		}
		if (str2.matches(regex)){
			System.out.println(str2+"是一个合法的电子邮箱字符格式");
		}
		if (str3.matches(regex)){
			System.out.println(str3+"是一个合法的电子邮箱字符格式");
		}
	}
}
