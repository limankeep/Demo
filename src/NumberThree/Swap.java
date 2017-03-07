//数组填充替换fiil
package NumberThree;
import java.util.*;
public class Swap {
	public static void main(String[] args){//主方法的入口
		int arr[] = new int[5];//创建一个int型数组
		Arrays.fill(arr, 8);//使用同一个值对数组进行填充
		for (int i = 0;i < arr.length;i++){//循环遍历数组中的元素
			//将数组中的元素依次输出
			System.out.println("第"+ i + "个元素是:" + arr[i]);
		}
	}
}
