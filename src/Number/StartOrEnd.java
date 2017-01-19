//startsWith()和endsWith()的用法
package Number;

public class StartOrEnd {
	public static void main(String[] args){//主方法的入口
		String num1 = "22045612";//定义字符串num1
		String num2 = "21304578";//定义字符串num2
		boolean b = num1.startsWith("22");//判断字符串num1是否以22开头
		boolean b2 = num1.endsWith("78");//判断字符串num1是否以78结尾
		boolean b3 = num2.startsWith("22");//判断字符串num2是否以22开头
		boolean b4 = num2.endsWith("78");//判断字符串num2是否以78结尾
		System.out.println(b);//输出信息判断出来的结果
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}
