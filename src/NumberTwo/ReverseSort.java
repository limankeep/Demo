//����ķ�ת
package NumberTwo;
//import java.util.*;
public class ReverseSort {
	public static void main(String[] args){
		int [] array ={10,20,30,40,50,60};
		//����һ������
		ReverseSort sorter = new ReverseSort();
		
		sorter.sort(array);
	}
	/**
	 *ֱ��ѡ������
	 *
	 * @param array
	 *      Ҫ���������
	 */
	public void sort(int [] array){
		System.out.println("����ԭ������:");
		showArray(array);//�������ǰ������ֵ
		int temp;
		int len = array.length;
		for (int i = 0;i < len / 2;i++){
			temp = array[i];
			array[i] = array[len - 1 - 1];
			array[len - 1 - 1] = temp;
		}
		System.out.println("���鷴ת�������");
		showArray(array);//�������������ֵ
	}
	/**
	 * ��ʾ��������Ԫ��
	 * 
	 * @param array
	 *    Ҫ��ʾ������
	 * */
	public void showArray(int[] array){
		for (int i : array){//foreach��ʽ��������
			System.out.println("\t" + i);//���ÿ������Ԫ��ֵ
		}
		System.out.println();
	}
	
	
	
	
	
	
}
