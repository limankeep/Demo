//Integer 计算数值数组各项之和
package NumbrFour;

public class Summation {
	public static void main(String[] args){//主方法的入口
		String str[] = {"23","12","10","18","35"};//定义string数组
		int sum = 0;
		for (int i = 0;i < str.length;i++){
			int myint = Integer.parseInt(str[i]);
			sum = sum + myint;
		}
		System.out.println("数组中的个元素之和是:" + sum);
	}
}
