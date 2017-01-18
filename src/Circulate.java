
public class Circulate {//创建类Circulate
	public static void main(String[] args){ //主方法入口
		int sum = 0;//声明变量，用于保存各数相加后的结果
		for (int i = 2; i <= 100; i += 2){
			sum = sum + i;//指定循环条件和循环体
		}
		System.out.println("2到100之间的所有偶数之和为："+sum);
	}
}
