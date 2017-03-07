//还是一些math函数
package NumberFive;

public class ExponentFunction {
	public static void main(String[] args){//主方法的入口
		//取e的2次方
		System.out.println("e的平方值:" + Math.exp(2));
		//取e为底2的对数
		System.out.println("以e为底2的对数值:" + Math.log(2));
		//取以10为底2的对数
		System.out.println("以10为低2的对数值: " + Math.log10(2));
		//取4的平方根
		System.out.println("4的平方根值:" + Math.sqrt(4));
		//取8的立方根
		System.out.println("8的立方根:" + Math.cbrt(8));
		//取2的2次方根
		System.out.println("2的2 次方根:" + Math.pow(2, 2));
	}
}
