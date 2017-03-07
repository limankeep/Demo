//数组查询
package NumberThree;
import java.util.*;
public class Example {
	public static void main(String[] args){//主方法入口
		int ia[] = new int[] {1,8,9,4,5,2};//定义数组int型数组ia
		Arrays.sort(ia);//将数组进行排序
		int index = Arrays.binarySearch(ia, 4);//查找数组ia中元素4的索引位置
		System.out.println("4的索引位置是:"+index);
	}
}
