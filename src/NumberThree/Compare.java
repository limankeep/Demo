//对象的比较
package NumberThree;

public class Compare {
	public static void main(String[] args){
		String c1 = new String("abc");//创建两个String型对象引用
		String c2 = new String("abc");
		String c3 = c1;
		System.out.println("c2==c3的运算结果为:" + (c2 == c3));
		System.out.println("c2.equals(c3)的运算结果为:" + (c2.equals(c3)));
	}
}
