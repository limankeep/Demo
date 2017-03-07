//数组的反转
package NumberTwo;
//import java.util.*;
public class ReverseSort {
	public static void main(String[] args){
		int [] array ={10,20,30,40,50,60};
		//创建一个数组
		ReverseSort sorter = new ReverseSort();
		
		sorter.sort(array);
	}
	/**
	 *直接选择排序法
	 *
	 * @param array
	 *      要排序的数组
	 */
	public void sort(int [] array){
		System.out.println("数组原有内容:");
		showArray(array);//输出排序前的数组值
		int temp;
		int len = array.length;
		for (int i = 0;i < len / 2;i++){
			temp = array[i];
			array[i] = array[len - 1 - 1];
			array[len - 1 - 1] = temp;
		}
		System.out.println("数组反转后的内容");
		showArray(array);//输出排序后的数组值
	}
	/**
	 * 显示数组所有元素
	 * 
	 * @param array
	 *    要显示的数组
	 * */
	public void showArray(int[] array){
		for (int i : array){//foreach格式遍历数组
			System.out.println("\t" + i);//输出每个数组元素值
		}
		System.out.println();
	}
	
	
	
	
	
	
}
