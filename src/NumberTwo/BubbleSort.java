//冒泡排序
package NumberTwo;

public class BubbleSort {
	public static void main(String[] args){//主方法的入口
		//创建一个数组。这个数组元素是乱序的
		int[] array = {63,4,24,1,3,15};
		//创建冒泡排序类的对象
		BubbleSort sorter = new BubbleSort();
		//调用排序方法将数组排序
		sorter.sort(array);
	}
	/**
	 * 冒泡排序
	 * 
	 *@param array
	 *  要排序的数组
	 * */
	public void sort(int[] array){
		for (int i = 1; i < array.length; i++){
			//比较相邻的两个元素，较大的数往后冒泡
			for (int j = 0; j < array.length - i;j++){
				if (array[j] > array[j + 1]){
					int temp = array[j];//把第一个元素值保持到临时变量中
					array[j] = array[j + 1];//把第二个元素保存到第一个元素中
					array[j + 1] = temp;//把临时变量也就是第一个元素原值保持到第二个元素中
				}
			}
		}
		showArray(array);//输出冒泡排序后的数组元素
	}
	public void showArray(int[] array){
		for (int i : array){
			System.out.println(">" + i);
		}
		System.out.println();
	}
}
