package Number;

public class Repetition {//创建类
	public static void main(String[] args){//主方法入口
		int arr[] = {7,10,1};//声明一组数组
		System.out.println("一维数组中的元素分别为：");//输出信息
		for (int x : arr){
			//foreach语句,int x引用的变量，arr指定要循环遍历 数组，最后将x输出
			System.out.println(x);
		}
	}
}
