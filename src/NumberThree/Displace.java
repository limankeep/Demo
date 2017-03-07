//数组的填充替换fill
package NumberThree;
import java.util.*;
public class Displace {
	public static void main(String[] args){//主方法的入口
		int arr[] = new int[] {45,12,2,10};
		Arrays.fill(arr,1,2,8);
		for (int i = 0;i < arr.length; i++){
			System.out.println("第"+ i + "个元素是:" + arr[i]);
		}
	}
}
