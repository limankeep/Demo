package NumberSix;

public class OverLoadTest {
	public static int add(int a, int b){
		return a + b;
	}
	//定义与第一个方法相同名称、参数不同的方法
	public static double add(double a, double b){
		return a + b;
	}
	//定义与第一个方法参数各数不同的方法
	public static int add(int a){
		return a;
	}
	//定义一个成员方法
	public static int add (int a, double b){
		return 1;
	}
	//这个方法与前一个方法参数次序不同
	public static int add(double a, int b){
		return 1;
	}
	public static void main(String[] args){//主方法的入口
		System.out.println("调用add（int int）方法:" + add(1,2));
		System.out.println("调用add（double double）方法:" + add(2.1,3.3));
		System.out.println("调用add（int）方法:" + add(1));
		
	}
}
