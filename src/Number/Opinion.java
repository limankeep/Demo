//equals();和equalsIgoreCase()方法比较的区别
package Number;

public class Opinion {
	public static void main(String[] args){//主方法的入口
		String s1 = new String("abc");//创建三个字符串对象s1,s2,s3
		String s2 = "ABC";
		boolean b1 = s1.equals(s2);//使用equals();和equalsIgoreCase()方法分别比较
		boolean b2 = s1.equalsIgnoreCase(s2);
		System.out.println(s1+"equals"+s2+":"+b1);
		System.out.println(s1+"equalsIgnoreCase"+s2+":"+b2);
	}
}
