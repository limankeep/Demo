//判断字符 大小写
package NumbrFour;

public class UpperOrLower {
	public static void main(String[] args){//主方法的入口
		Character mychar1 = new Character('A');
		Character mychar2 = new Character('a');
		System.out.println(mychar1 + "是大写字母吗？" + Character.isUpperCase(mychar1));
		System.out.println(mychar2 + "是小写字母吗？" + Character.isLowerCase(mychar2));
	}
}
