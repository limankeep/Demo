//数组的查询 字符串数组
package NumberThree;
import java.util.*;
public class Rakel {
	public static void main(String[] args){//主方法入口
		//定义String型数组str
		String str[] = new String[] {"ab","cd","ef","yz"};
		Arrays.sort(str);//将数组进行排序
		//在指定的范围内搜索哦元素cd的索引位置
		int index = Arrays.binarySearch(str,0,2,"cd");
		System.out.println("cd的索引位置是:"+index);//将索引输出
	}
}
