package NumberFive;
/**
 * 定义产生偶数的方法
 * @param num1起始范围参数
 * @param num2终止范围参数
 * @return 随机的范围内的偶数
 * */
public class MathRondom {
	public static void main(String[] args){//主方法的入口
	//调用产生随机数 的方法
		System.out.println("任意一个2~31之间的偶数:" + GetEvenNum(2,32));
	}
	public static int GetEvenNum(double num1, double num2){
		//产生num1~num2之间的随机数
		int s = (int) num1 + (int) (Math.random() * (num2 - num1));
		if (s % 2 == 0){//判断随机数是否为偶数
			return s;
		}else{
			return s+1;
		}
	}
}
