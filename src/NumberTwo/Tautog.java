//二维数组的遍历
package NumberTwo;
public class Tautog {
	
	public static void main(String[] args){//主方法的入口
		int arr2[][] = {{4,3},{1,2}};//定义二维数组
		System.out.println("数组中元素是:");//提示信息
		for (int x[] : arr2){//外围循环变量为一维数组
			for (int e : x){
				if (e == x.length){
					System.out.println(e);
				}else{
					//如果不是二维数组中的最后一个元素
					System.out.println(e+"、");
				}
			}
		}
	}
}
