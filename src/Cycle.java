
public class Cycle {
	public static void main(String[] args){
		int a = 100;//声明变量的类型和初值
		while (a == 60)//指定进入循环的调价
		{
			System.out.println("ok1");//while语句循环体
			a--;
		}
		int b = 100;//声明b的类型和初值
		do{
			System.out.println("ok2");//do ..while 循环体
			b--;
		} while (b == 60);//指定循环结条件
	}
}
